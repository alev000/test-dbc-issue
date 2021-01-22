scalaVersion := "2.12.10"

lazy val example = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
