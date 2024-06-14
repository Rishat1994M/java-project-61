plugins {
    application
    checkstyle
}

application {
    mainClass = "java.hexlet.code.App"
}

group = "java.hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
