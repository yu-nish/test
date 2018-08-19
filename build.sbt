lazy val akkaHttpVersion = "10.1.3"
lazy val akkaVersion    = "2.5.14"
lazy val Json4sVersion = "3.5.2"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.akkaserver",
      scalaVersion    := "2.12.6"
    )),
    name := "akkaserver",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,

      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test,
      "com.typesafe.akka" %% "akka-slf4j"           % akkaVersion,
      "ch.qos.logback"    % "logback-classic"       % "1.2.3",

      "org.json4s"        %% "json4s-native"   % Json4sVersion,
      "org.json4s"        %% "json4s-ext"      % Json4sVersion,
      "de.heikoseeberger" %% "akka-http-json4s" % "1.16.0",
    )
  )
