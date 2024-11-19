ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "FPd"
  )

libraryDependencies ++= Seq(
  // MongoDB Spark Connector
  "org.mongodb.spark" %% "mongo-spark-connector" % "10.1.0",

  // Apache Spark Core and SQL
  "org.apache.spark" %% "spark-core" % "3.5.0",
  "org.apache.spark" %% "spark-sql" % "3.5.0"
)
