import sbt._

object Dependencies{
  object V{
    val betterMonadicFor = "0.3.1"

    val cats      = "2.7.0"
    val catsEffect = "3.3.0"
    val catsTime    = "0.5.0"
    val log4cats = "2.1.1"

    val scalaTest = "3.2.8"
    val taglessContext = "0.1.4"
  }

  object Libraries {
    val catsCore = "org.typelevel" %% "cats-core" % V.cats
    val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect
    val catsTime = "org.typelevel" %% "cats-time" % V.catsTime

    val catsLogs = "org.typelevel" %% "log4cats-core" % V.log4cats
    val catsSlf4j= "org.typelevel" %% "log4cats-slf4j" % V.log4cats

    val scalaTest = "org.scalatest" %% "scalatest" % V.scalaTest
  }

  object CompilerPlugin {
    val betterMonadicFor = compilerPlugin(
      "com.olegpy" %% "better-monadic-for" % V.betterMonadicFor
    )
  }


  object P {
    val taglessFinalContext = "org.augustjune" %% "context-applied" % V.taglessContext
  }
}
