plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.example.tracker_presentation"
}

dependencies {
    implementation(project(Modules.coreDomain))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.trackerDomain))
    implementation(Coil.coilCompose)
}