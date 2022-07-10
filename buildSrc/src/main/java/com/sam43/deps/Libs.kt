package com.sam43.deps

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.2.1"
    const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.1.5"

    const val junit = "junit:junit:4.13.2"

    const val material3 = "com.google.android.material:material:1.6.1"

    object Kotlin {
        private const val version = "1.7.0"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.6.0"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.2"
        const val coreKtx = "androidx.core:core-ktx:1.7.0"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            const val compilerVersion = "1.2.0"
            const val snapshot = ""
            private const val version = "1.2.0-rc03"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val test = "androidx.compose.ui:ui-test:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val uiText = "androidx.compose.ui:ui-text-google-fonts:$version"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val viewBinding = "androidx.compose.ui:ui-viewbinding:$version"

            object Material3 {
                const val snapshot = ""
                private const val version = "1.0.0-alpha10"

                const val material3 = "androidx.compose.material3:material3:$version"
            }
        }

        object Navigation {
            private const val version = "2.4.2"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Test {
            private const val version = "1.4.0"
            private const val arch_version = "2.1.0"
            const val core = "androidx.test:core:$version"
            const val archCoreTesting = "androidx.arch.core:core-testing:$arch_version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.3"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
        }

        object Lifecycle {
            private const val version = "2.5.0"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
            const val lifecycleKapt = "androidx.lifecycle:lifecycle-compiler:$version"
        }
    }

    object Hilt {
        const val version = "2.42"
        const val androidHiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val hilt = "com.google.dagger:hilt-android:$version"
        object Test {
            // For Robolectric tests.
            // ...with Kotlin.
            const val hiltTest = "com.google.dagger:hilt-android-testing:$version"
            // For instrumented tests.
            // ...with Kotlin.
            const val hiltAndroidTest = "com.google.dagger:hilt-android-testing:$version"
        }
        object Kapt {
            const val hiltKapt = "com.google.dagger:hilt-compiler:$version"
            const val hiltKaptTest = "com.google.dagger:hilt-android-compiler:$version"
            const val hiltAndroidKaptTest = "com.google.dagger:hilt-android-compiler:$version"
        }
    }

    object Network {
        private const val okhttp_log_interceptor = "5.0.0-alpha.2"
        private const val okhttp_profile_interceptor = "1.0.8"
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val retrofitConverter =  "com.squareup.retrofit2:converter-gson:2.9.0"
        const val retrofitOkhttp = "com.squareup.okhttp3:okhttp:$okhttp_log_interceptor"
        const val retrofitInterceptor =  "com.squareup.okhttp3:logging-interceptor:$okhttp_log_interceptor"
        const val retrofitOkhttpProfiler =  "com.localebro:okhttpprofiler:$okhttp_profile_interceptor"
    }

    object Db {
        private const val roomVersion = "2.4.2"
        const val room = "androidx.room:room-runtime:$roomVersion"
        const val roomKapt =  "androidx.room:room-compiler:$roomVersion"
        // optional - Kotlin Extensions and Coroutines support for Room
        const val roomCoroutines =  "androidx.room:room-ktx:$roomVersion"
        const val roomTest =  "androidx.room:room-testing:$roomVersion"
        // optional - Paging 3 Integration
        const val roomPagingSupport =  "androidx.room:room-paging:2.5.0-alpha02"
    }
}
