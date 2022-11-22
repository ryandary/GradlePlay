plugins {
    id("gradleplay.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
    implementation("GPLib:lib") {
        version {
            branch = "master"
        }
    }
}

application {
    mainClass.set("gradleplay.app.AppKt")
}
