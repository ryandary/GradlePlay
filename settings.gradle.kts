import java.net.URI

sourceControl {
    gitRepository(URI("https://github.com/ryandary/GPLib")) {
        producesModule("GPLib:lib")
        rootDir = ""
    }
}

rootProject.name = "GradlePlay"
include("app", "list", "utilities")
