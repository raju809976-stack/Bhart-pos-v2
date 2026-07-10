plugins {
  base
}

tasks.register("assembleRelease") {
  group = "build"
  description = "Assembles the release artifact for this project."
  dependsOn(":app:assembleRelease")
}

tasks.register("assembleDebug") {
  group = "build"
  description = "Assembles the debug artifact for this project."
  dependsOn(":app:assembleDebug")
}
