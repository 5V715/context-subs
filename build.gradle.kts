import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    // kotlin("jvm") version "1.9.23"
    kotlin("jvm") version "2.0.0"
}

group = "com.mobimeo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
        freeCompilerArgs = (freeCompilerArgs.get() + "-Xcontext-receivers")
    }
}