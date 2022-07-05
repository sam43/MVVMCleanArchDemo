import com.sam43.deps.AppConfig
import com.sam43.deps.AppDependencies
import com.sam43.deps.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testRunnerClass
    }

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "BASE_URL", AppConfig.BASE_URL)
        }
        getByName("release") {
            buildConfigField("String", "BASE_URL", AppConfig.BASE_URL)
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    AppConfig.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true

        // Disable unused AGP features
        buildConfig = true
        aidl = false
        renderScript = false
        resValues = false
        shaders = false
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.AndroidX.Compose.compilerVersion
    }

    packagingOptions {
//        exclude "META-INF/licenses/**"
//        exclude "META-INF/AL2.0"
//        exclude "META-INF/LGPL2.1"
    }
    flavorDimensions(AppConfig.dimension)
    productFlavors {
        create("staging") {
            applicationIdSuffix = ".staging"
            dimension = AppConfig.dimension
            //setDimension(AppConfig.dimension)
        }

        create("production") {
            dimension = AppConfig.dimension
            //setDimension(AppConfig.dimension)
        }
    }
}

// I think this is overkill until the KTS migration
// Once it's done, we can use shared commonBuild.gradle.kts
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    //std lib and app libs
    implementation(AppDependencies.appLibraries)
    // Lifecycle libs
    implementation(AppDependencies.appLifeCycleLibraries)
    kapt(Libs.AndroidX.Lifecycle.lifecycleKapt)
    // compose and material3
    implementation(AppDependencies.appComposeLibraries)
    // Hilt
    implementation(AppDependencies.appHiltLibraries)
    kapt(Libs.Hilt.Kapt.hiltKapt)
    // navigation
    implementation(AppDependencies.appNavigationLibraries)
    // Retrofit2 Networking
    implementation(AppDependencies.networkLibraries)


    //test libs
    testImplementation(AppDependencies.testLibraries)
    androidTestImplementation(AppDependencies.androidTestLibraries)

    // Hilt test
    testImplementation(Libs.Hilt.Test.hiltTest)
    kaptTest(Libs.Hilt.Kapt.hiltKaptTest)
    androidTestImplementation(Libs.Hilt.Test.hiltAndroidTest)
    kaptAndroidTest(Libs.Hilt.Kapt.hiltAndroidKaptTest)

    debugImplementation(Libs.AndroidX.Compose.tooling)
    debugImplementation(Libs.AndroidX.Compose.uiTestManifest)

    // androidx.test is forcing JUnit, 4.12. This forces it to use 4.13
//    configurations.configureEach {
//        resolutionStrategy {
//            force = Libs.junit
//        }
//    }
}