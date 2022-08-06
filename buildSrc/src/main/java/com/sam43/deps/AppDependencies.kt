package com.sam43.deps
import com.sam43.deps.Libs.AndroidX.Test.espressoCore
import com.sam43.deps.Libs.AndroidX.appcompat
import com.sam43.deps.Libs.AndroidX.coreKtx
import com.sam43.deps.Libs.Coroutines.core
import com.sam43.deps.Libs.Coroutines.test
import com.sam43.deps.Libs.material3
import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {
    val appLibraries = arrayListOf<String>().apply {
        addAll(listOf(
                Libs.Kotlin.stdlib, coreKtx, appcompat, core, material3, Libs.Coroutines.android
            ))
    }
    val appComposeLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.AndroidX.Activity.activityCompose,
            Libs.AndroidX.Compose.layout,
            Libs.AndroidX.Compose.materialIconsExtended,
            Libs.AndroidX.Compose.toolingPreview,
            Libs.AndroidX.Compose.uiUtil,
            Libs.AndroidX.Compose.runtime,
            Libs.AndroidX.Compose.runtimeLivedata,
            Libs.AndroidX.Compose.uiText,
            Libs.AndroidX.Compose.viewBinding
        ))
    }
    val appLifeCycleLibraries = arrayListOf<String>().apply {
        addAll(listOf(
                Libs.AndroidX.Lifecycle.livedata,
                Libs.AndroidX.Lifecycle.viewModel,
                Libs.AndroidX.Lifecycle.viewModelCompose
            )
        )
    }
    val appNavigationLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.AndroidX.Navigation.fragment,
            Libs.AndroidX.Navigation.uiKtx
        ))
    }
    val appHiltLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.Hilt.hilt
        ))
    }
    val networkLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.Network.retrofit,
            Libs.Network.retrofitOkhttp,
            Libs.Network.retrofitConverter,
            Libs.Network.retrofitInterceptor,
            Libs.Network.retrofitOkhttpProfiler
        ))
    }
    val networkMockingLibraries = arrayListOf<String>().apply {
        addAll(listOf())
    }
    val roomDbLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.Db.room,
            Libs.Db.roomKtx,
            // optional
            //Libs.Db.roomPagingSupport
        ))
    }
    val androidTestLibraries = arrayListOf<String>().apply {
        addAll(listOf(
            Libs.AndroidX.Test.Ext.junit,
            test,
            espressoCore,
            Libs.AndroidX.Compose.uiTest,
            Libs.AndroidX.Test.archCoreTesting,
            Libs.AndroidX.Test.core,
            Libs.Hilt.Test.hiltAndroidTest
        ))
    }
    val testLibraries = arrayListOf<String>().apply {
        addAll(listOf(Libs.junit,
            Libs.Db.roomTest,
            Libs.Hilt.Test.hiltTest,))
    }
}

// We can use this after the groovy to kts migration (future)
//util functions for adding the different type dependencies from build.gradle file
/*
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}*/
