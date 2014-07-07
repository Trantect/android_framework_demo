android_framework_demo
===================================

一、Dependencies
-----------------------------------
We use some third-party libraries:
(Please refer to [this](https://github.com/Trinea/android-open-project))
### （1）Dependency injection framework
- [AndroidAnnotation](https://github.com/excilys/androidannotations)

Note:<br />
1. Do NOT ignore the pattern<br />
2. Do NOT make every class use the pattern<br />
3. Do NOT store dependencies as static fields<br />

		Avoid dependency injection frameworks

		Using a dependency injection framework such as Guice or RoboGuice may be attractive because they can simplify the code you write and provide an adaptive environment that's useful for testing and other configuration changes. However, these frameworks tend to perform a lot of process initialization by scanning your code for annotations, which can require significant amounts of your code to be mapped into RAM even though you don't need it. These mapped pages are allocated into clean memory so Android can drop them, but that won't happen until the pages have been left in memory for a long period of time.

http://developer.android.com/training/articles/memory.html#DependencyInjection

### （2）Network
- [Asynchronous Http Client for Android (android-async-http)](https://github.com/loopj/android-async-http)



二、Build
-----------------------------------
We use gradle to build project:

- use terminal and change current directory to project root directory
- run command<code>./gradlew clean</code> to clean project
- run command<code>./gradlew assemble</code> to assemble debug and release builds
- run command<code>./gradlew assembleDebug</code> to assemble debug build
- run command<code>./gradlew assembleRelease</code> to assemble release build
- Then you can see apk files in folder <code>./build/outputs/apk/</code>



三、Tests
-----------------------------------
### （1）Unit Tests (small-scope and low-level)
- [Android API](https://developer.android.com/tools/testing/index.html)
- [Robolectric](https://github.com/robolectric/robolectric)
- [FEST-android](https://github.com/square/fest-android)

### （2）Integration and UI Tests (large-scope and interacted)
- [Android Instrumentation API](http://developer.android.com/tools/testing/index.html)
- [Robotium](https://code.google.com/p/robotium/) and [code](https://github.com/RobotiumTech/robotium)
- [UI Automator](http://developer.android.com/tools/help/uiautomator/index.html) and [how-to](http://developer.android.com/tools/testing/testing_ui.html)
- [Espresso](https://code.google.com/p/android-test-kit/)
- [Calabash-android](https://github.com/calabash/calabash-android) (its underlying implementation uses Robotium)



四、Code Coverage
-----------------------------------
Since gradle 10.0.+, the code coverage feature of Jacoco is integrated with gradle build tool. Please refer to build.gradle file for config details.
- run command <code>./gradlew clean connectedCheck</code> to run Android tests and code coverage.
- The reports locate in <code>app/build/outputs/reports</code>



五、Thanks to
-----------------------------------
- [guoyunsky](https://github.com/guoyunsky) for his [演示Markdown的各种语法](https://github.com/guoyunsky/Markdown-Chinese-Demo)
