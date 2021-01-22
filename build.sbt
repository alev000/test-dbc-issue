scalaVersion := "2.12.10"

lazy val example = (project in file(".")).enablePlugins(PlayScala)

Compile / unmanagedJars ++= (new java.io.File("/usr/local/lib/python3.7/site-packages/pyspark/jars") ** "*.jar").classpath

libraryDependencies += guice
