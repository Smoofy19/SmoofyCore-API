plugins {
    id("java")
    id("maven-publish")
}

group = "de.smoofy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://nexus.velocitypowered.com/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.2-R0.1-SNAPSHOT")
    compileOnly("com.velocitypowered:velocity-api:3.1.1")

    compileOnly(platform("eu.cloudnetservice.cloudnet:bom:4.0.0-RC9"))
    compileOnly("eu.cloudnetservice.cloudnet:driver")
    compileOnly("eu.cloudnetservice.cloudnet:bridge")
    compileOnly("eu.cloudnetservice.cloudnet:wrapper-jvm")
    compileOnly("eu.cloudnetservice.cloudnet:syncproxy")
    compileOnly("eu.cloudnetservice.cloudnet:platform-inject-api")
    compileOnly("eu.cloudnetservice.cloudnet:platform-inject-processor")

    annotationProcessor("org.projectlombok:lombok:1.18.28")
    compileOnly("org.projectlombok:lombok:1.18.28")

    compileOnly("org.fusesource.jansi:jansi:2.4.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.withType<JavaCompile>().configureEach() {
    options.encoding = "UTF-8"
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}