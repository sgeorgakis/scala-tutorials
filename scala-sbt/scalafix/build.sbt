lazy val root = (project in file("."))
  .settings(
    name := "scalafix",
    scalaVersion := "3.4.3",
    version := "1.0.0",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalacOptions += "-Wunused:all"
  )
