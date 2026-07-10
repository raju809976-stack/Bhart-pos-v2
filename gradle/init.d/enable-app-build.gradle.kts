gradle.beforeSettings {
    it.pluginManagement {
        repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
        }
    }

    it.dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
        }
    }

    it.include(":app")
}

gradle.projectsEvaluated {
    val root = gradle.rootProject
    root.tasks.matching { it.name == "assembleDebug" }.configureEach {
        dependsOn(":app:assembleDebug")
    }
    root.tasks.matching { it.name == "assembleRelease" }.configureEach {
        dependsOn(":app:assembleRelease")
    }
}
