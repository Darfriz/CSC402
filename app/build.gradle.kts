plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.zakat"
    compileSdk = 30 // Change this to a stable version, like 30

    defaultConfig {
        applicationId = "com.example.zakat"
        minSdk = 24
        targetSdk = 30 // Change this to a stable version, like 30
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
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.3.1") // Use a stable version
    implementation("com.google.android.material:material:1.4.0") // Use a stable version
    implementation("androidx.constraintlayout:constraintlayout:2.0.4") // Use a stable version
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
}
