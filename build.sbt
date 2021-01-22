scalaVersion := "2.12.10"

lazy val example = (project in file(".")).enablePlugins(PlayScala)

unmanagedBase := new java.io.File("/usr/local/lib/python3.7/site-packages/pyspark/jars")

libraryDependencies += guice
