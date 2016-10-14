val commonSettings = Seq(
  organization := "com.example",
  name := "foldable",
  scalaVersion := "2.12.0-RC1-1e81a09"
)

val foldableOld = project.settings(
  commonSettings,
  version := "0.1" 
)

val foldableNew = project.settings(
  commonSettings,
  version := "0.2"
)
