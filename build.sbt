name := "wbKanban"

version := "1.0"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "8.0.1.v20110908" % "container"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.3"

libraryDependencies += "org.scalaz" %% "scalaz-http" % "6.0.3"

libraryDependencies += "com.h2database" % "h2" % "1.2.137"

libraryDependencies += "org.squeryl" %% "squeryl" % "0.9.5-RC1"

