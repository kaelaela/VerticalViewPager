package me.kaelaela.verticalviewpager;

/**
 * Copyright (C) 2015 Kaelaela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

import me.kaelaela.verticalviewpager.transforms.DefaultTransformer;

public class VerticalViewPager extends ViewPager {
	// Intercept threshold default (in dp)
	private static final float DEFAULT_THRESHOLD_Y = 16f;

	// Variables used for intercepting touches
	private float startY;
	private float thresholdY;

    public VerticalViewPager(Context context) {
        super(context);
	    init(context, null);
    }

    public VerticalViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
	    init(context, attrs);
    }

	private void init(Context context, AttributeSet attrs) {
		setPageTransformer(false, new DefaultTransformer());

		if (attrs == null) {
			thresholdY = convertDpToPixel(context, DEFAULT_THRESHOLD_Y);
			return;
		}

		TypedArray attributes = null;
		try {
			attributes = context.obtainStyledAttributes(attrs, R.styleable.VerticalViewPager);
			thresholdY = attributes.getDimensionPixelSize(R.styleable.VerticalViewPager_vvp_threshold, convertDpToPixel(context, DEFAULT_THRESHOLD_Y));
		} finally {
			if (attributes != null) {
				attributes.recycle();
			}
		}
	}

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean intercept = shouldIntercept(event) || super.onInterceptTouchEvent(swapTouchEvent(event));
        //If not intercept, touch event should not be swapped.
        swapTouchEvent(event);
        return intercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(swapTouchEvent(ev));
    }

	private boolean shouldIntercept(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			startY = event.getY();
		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			if (Math.abs(startY - event.getY()) > thresholdY) {
				return true;
			}
		}

		return false;
	}

	private MotionEvent swapTouchEvent(MotionEvent event) {
		float width = getWidth() - getPaddingLeft() - getPaddingRight();
		float height = getHeight() - getPaddingTop() - getPaddingBottom();

		float swappedX = (event.getY() / height) * width;
		float swappedY = (event.getX() / width) * height;

		event.setLocation(swappedX, swappedY);

		return event;
	}

	private static int convertDpToPixel(Context context, float dp) {
		Resources resources = context.getResources();
		DisplayMetrics metrics = resources.getDisplayMetrics();

		return (int) (dp * (metrics.densityDpi / 160f));
	}
}
