name := "spring-boot-scala-web"

version := "1.0.0"

scalaVersion := "2.11.7"

sbtVersion := "0.13.9"

enablePlugins(TomcatPlugin)

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.4.0.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.4.0.RELEASE",
  "org.webjars" % "bootstrap" % "3.1.1",
  "org.thymeleaf" % "thymeleaf-spring4" % "3.0.1.RELEASE",
  "org.hibernate" % "hibernate-validator" % "5.2.4.Final",
  "nz.net.ultraq.thymeleaf" % "thymeleaf-layout-dialect" % "2.0.1",
  "org.hsqldb" % "hsqldb" % "2.3.4",
  "org.springframework.boot" % "spring-boot-starter-tomcat" % "1.4.0.RELEASE" % "provided",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)


libraryDependencies ++= Seq(
  "org.apache.tomcat.embed" % "tomcat-embed-core"         % "8.0.36" % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % "8.0.36" % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper"       % "8.0.36" % "container"
)
