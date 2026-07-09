plugins {
  base
}

tasks.register("assembleRelease") {
  group = "build"
  description = "Assembles the release artifact placeholder for this project."
}

tasks.register("assembleDebug") {
  group = "build"
  description = "Assembles the debug artifact placeholder for this project."
}
