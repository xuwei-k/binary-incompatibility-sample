val sampleLibrary = project.settings(
  scalaVersion := "2.12.1",
  libraryDependencies += "com.example" %% "foldable" % "0.1"
)

val sampleMain = project.settings(
  scalaVersion := "2.12.1",
  libraryDependencies += "com.example" %% "foldable" % "0.2"
).dependsOn(
  sampleLibrary
)
