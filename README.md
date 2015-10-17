VerticalViewPager
===
[![Platform](http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat)](http://developer.android.com/index.html)
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Very (very) simple vertically ViewPager and vertically transformer for Android.

![default] ![zoom_out] ![stack]

## Usage

```java
VerticalViewPager viewPager = new VerticalViewPager();
viewPager.setAdapter(adapter);
viewPager.setPageTransformer(treu, new DefaultTransformer());
//viewPager.setPageTransformer(treu, new ZoomOutTransformer());
//viewPager.setPageTransformer(treu, new StackTransformer());
```

## Download from Gradle

```groovy
dependencies {
    compile 'me.kaelaela:VerticalViewPager:1.0.0'
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
