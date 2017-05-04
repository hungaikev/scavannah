name := "scavannah"

version := "1.0"

scalaVersion := "2.12.0"



scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.jcenterRepo
)


libraryDependencies ++= {
  val akkaV       = "2.4.17"
  val scalaTestV  = "3.0.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "org.scalatest"     %% "scalatest" % scalaTestV % "test",
    "org.spire-math" %% "spire" % "0.13.0",
    "com.chuusai" %% "shapeless" % "2.3.2"
  )
}

    