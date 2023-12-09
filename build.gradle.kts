plugins {
    id("java")
    id("maven-publish")
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "de.smoofy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://nexus.velocitypowered.com/repository/maven-public/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.20.2-R0.1-SNAPSHOT")
    compileOnly("com.velocitypowered:velocity-api:3.1.1")

    compileOnly(platform("eu.cloudnetservice.cloudnet:bom:4.0.0-RC9"))
    compileOnly("eu.cloudnetservice.cloudnet:driver")
    compileOnly("eu.cloudnetservice.cloudnet:bridge")
    compileOnly("eu.cloudnetservice.cloudnet:wrapper-jvm")
    compileOnly("eu.cloudnetservice.cloudnet:syncproxy")
    compileOnly("eu.cloudnetservice.cloudnet:platform-inject-api")
    compileOnly("eu.cloudnetservice.cloudnet:platform-inject-processor")

    compileOnly("net.luckperms:api:5.4")

    implementation("com.github.cryptomorin:XSeries:9.7.0") { isTransitive = false }

    annotationProcessor("org.projectlombok:lombok:1.18.28")
    compileOnly("org.projectlombok:lombok:1.18.28")

    compileOnly("org.fusesource.jansi:jansi:2.4.0")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
        relocate("com.cryptomorin.xseries", "de.smoofy.core.api.xseries")
    }
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