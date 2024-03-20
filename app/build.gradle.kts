@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.technopradyumn.nextmeme"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.technopradyumn.nextmeme"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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

    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //noinspection UseTomlInstead
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")
    //noinspection UseTomlInstead
    implementation ("com.android.volley:volley:1.2.1")

    //noinspection UseTomlInstead
    implementation("com.squareup.retrofit2:retrofit:2.10.0")
    //noinspection UseTomlInstead
    implementation("com.google.code.gson:gson:2.10.1")
    //noinspection UseTomlInstead
    implementation("com.squareup.retrofit2:converter-gson:2.10.0")
    //noinspection UseTomlInstead
    implementation("com.github.bumptech.glide:glide:4.16.0")

}