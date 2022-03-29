import dependencies.AnnotationProcessorsDependencies
import dependencies.Dependencies
import ext.implementation
import ext.kapt

plugins {
    id("common.android-library")
}

dependencies {
    implementation(project(BuildModules.Commons.NAVIGATION))
    implementation(Dependencies.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.RECYCLE_VIEW)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
    implementation(Dependencies.COIL)
    implementation(Dependencies.ANDROID_SDP)
    implementation(Dependencies.NAVIGATION_FRAGMENT)

    kapt(AnnotationProcessorsDependencies.DATABINDING)
}
