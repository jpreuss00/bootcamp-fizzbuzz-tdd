/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.0/userguide/tutorial_java_projects.html
 */

plugins {
    java
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application.
    mainClassName = "org.example.fizzbuzz.FizzBuzz"
}

tasks.withType(Jar::class) {
    manifest {
        attributes["Main-Class"] = "org.example.fizzbuzz.FizzBuzz"
    }
}