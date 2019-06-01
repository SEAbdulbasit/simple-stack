apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
apply plugin: 'kotlin-kapt'
apply plugin: 'realm-android'

android {
    compileSdkVersion 27

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    defaultConfig {
        applicationId "com.zhuinden.simplestackkotlindaggerexample"
        minSdkVersion 16
        targetSdkVersion 27
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }

    androidExtensions {
        experimental = true
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.21"
    implementation 'com.android.support:appcompat-v7:27.1.1'
    implementation 'com.android.support:recyclerview-v7:27.1.1'
    implementation 'com.squareup.okhttp3:okhttp:3.10.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:3.10.0'
    implementation 'com.google.dagger:dagger:2.16'
    implementation 'com.android.support:support-v4:27.1.1'
    kapt 'com.google.dagger:dagger-compiler:2.16'
    implementation project(path: ':simple-stack')

    implementation('com.squareup.retrofit2:retrofit:2.4.0') {
        // exclude Retrofit’s OkHttp peer-dependency module and define your own module import
        exclude module: 'okhttp'
    }
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'io.reactivex.rxjava2:rxandroid:2.0.2'
    implementation 'io.reactivex.rxjava2:rxjava:2.1.16'
    implementation 'com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0'
    implementation 'com.android.support:multidex:1.0.3'
    implementation 'io.reactivex.rxjava2:rxkotlin:2.2.0'
    implementation 'io.realm:android-adapters:3.0.0'
}
