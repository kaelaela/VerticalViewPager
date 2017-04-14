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
    The MIT License (MIT)
    Copyright (c) 2015 kaelaela
    
    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
