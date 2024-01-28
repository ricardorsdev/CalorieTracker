plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.example.core_data"
}

dependencies {
    implementation(project(Modules.coreDomain))
}
