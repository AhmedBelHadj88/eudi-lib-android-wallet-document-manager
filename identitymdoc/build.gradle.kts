plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(17)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

android {
    namespace = "com.android.identity"
    compileSdk = 34
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    defaultConfig {
        minSdk = 24
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(project(":identity"))
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.io.bytestring)
    implementation(libs.bouncy.castle.prov)
    implementation(libs.bouncy.castle.pkix)
    implementation(libs.tink)
    implementation(libs.kotlin.test)
    implementation(libs.kotlinx.coroutine.test)
    implementation(libs.androidx.monitor)
    implementation(libs.androidx.junit.ktx)
}