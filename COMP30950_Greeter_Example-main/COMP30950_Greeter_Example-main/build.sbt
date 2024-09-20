// *** DO NOT EDIT THIS FILE, OTHER THAN TO CHANGE name ****

val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "greeter",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.16" % "test"
  )