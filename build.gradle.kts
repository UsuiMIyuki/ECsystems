plugins {
    java
    kotlin("jvm") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("mysql","mysql-connector-java","8.0.20")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit","junit","4.13")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.6.2")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
tasks.test{
    useTestNG()
    useJUnitPlatform()
    failFast=true
    testLogging{
        events = setOf(org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED,
            org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED,
            org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED)
        showExceptions = true
    }
    maxParallelForks =Runtime.getRuntime().availableProcessors().takeIf{it>0}?:1
}