scalaVersion := "2.12.10"

lazy val example = (project in file(".")).enablePlugins(PlayScala)

Compile / unmanagedJars ++= {
  val dir = "/usr/local/lib/python3.7/site-packages/pyspark/jars"
  val toExclude = Seq("slf4j-log4j")
  val result = (new java.io.File(dir) ** "*.jar").filter { f =>
    toExclude.forall(x => !f.name.contains(x))
  }
  result.classpath
}

libraryDependencies += guice
