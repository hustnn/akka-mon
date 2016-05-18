name := "akka-mon"

organization := "org.akkamon"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.5",
  "com.typesafe.akka" %% "akka-contrib" % "2.4.5",
  "org.scala-lang" % "scala-reflect" % "2.11.7")


resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"