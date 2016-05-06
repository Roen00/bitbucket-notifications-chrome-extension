enablePlugins(ScalaJSPlugin, ChromeSbtPlugin)

name := "bitbucket-notifications-chrome-extension"

version := "1.0"

scalaVersion := "2.11.8"


persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "net.lullabyte" %%% "scala-js-chrome" % "0.2.0",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)