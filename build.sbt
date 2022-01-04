import Dependencies._

ThisBuild / organization  := "ar.empanada"
ThisBuild / version       := "0.0.1"
ThisBuild / scalaVersion  := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "github-committer",
  ).aggregate(core, tests)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "githubCommitter-core",
    libraryDependencies ++= Seq(
      CompilerPlugin.betterMonadicFor,
      Libraries.catsCore,
      Libraries.catsEffect,
      Libraries.catsTime,
      Libraries.catsLogs,
      Libraries.catsSlf4j,
      compilerPlugin(P.taglessFinalContext)
    )
  )

lazy val tests = (project in file("modules/tests"))
//  .configs(IntegrationTest)
  .settings(
    name := "githubCommitter-test-suite",
//    Defaults.itSettings,
    libraryDependencies ++= Seq(
      CompilerPlugin.betterMonadicFor,
      Libraries.catsCore,
      Libraries.catsEffect,
      Libraries.scalaTest % "it,test",
    ),
  ).dependsOn(core)