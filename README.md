VerticalViewPager
===

[![Build Status](https://travis-ci.org/kaelaela/VerticalViewPager.svg)](https://travis-ci.org/kaelaela/VerticalViewPager)
[![Platform](http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat)](http://developer.android.com/index.html)
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-VerticalViewPager-green.svg?style=flat)](https://android-arsenal.com/details/1/2651)

Vertically ViewPager and vertically transformer for Android.
This library is not copy ViewPager code. Extended class.

![default](art/default.gif) ![zoom_out](art/zoom_out.gif) ![stack](art/stack.gif)

## Usage

```java

VerticalViewPager viewPager = new VerticalViewPager();
viewPager.setAdapter(adapter);
viewPager.setPageTransformer(false, new DefaultTransformer());

//viewPager.setPageTransformer(false, new ZoomOutTransformer());
//viewPager.setPageTransformer(true, new StackTransformer());

```

## Download from Gradle

```groovy

dependencies {
    compile 'me.kaelaela:verticalviewpager:1.0.0@aar'
}

```

## Next

- [ ] Use with scrollable views(ListView, ScrollView, RecyclerView, WebView).
- [ ] Add more transformers.(Please contribute me!
- [ ] Sticky header.

## Me

Yuichi Maekawa(Kaelaela)
* Twitter [@Yuichi0531](https://twitter.com/Yuichi0531)
* kaelaela.31@gmail.com

License
-------
    Copyright (C) 2015 kaelaela
    Copyright (C) 2013 The Android Open Source Project

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
