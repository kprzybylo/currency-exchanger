plugins {
    kotlin("jvm") version "1.4.30"
    id("org.springframework.boot") version "2.4.3"
}

group "org.currencyexchanger"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.springframework.boot:spring-boot-starter-web:2.4.3")
}
