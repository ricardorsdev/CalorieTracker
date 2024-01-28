plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.example.onboarding_data"
}

dependencies {
    implementation(project(Modules.coreDomain))
    implementation(project(Modules.onboardingDomain))
}