name := "Finagle_Experiment"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "6.34.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test")