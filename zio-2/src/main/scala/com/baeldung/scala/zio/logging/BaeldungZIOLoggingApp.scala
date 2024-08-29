package com.baeldung.scala.zio.logging

import zio._

object BaeldungZIOLoggingApp extends ZIOAppDefault {

  val app: ZIO[Any, Nothing, Unit] = for {
    - <- ZIO.logTrace("This is a trace message")
    _ <- ZIO.logDebug("This is a debug message")
    _ <- ZIO.logInfo("This is an info message")
    _ <- ZIO.logWarning("This is a warning message")
    _ <- ZIO.logError("This is an error message")
  } yield ()

  override def run: ZIO[ZIOAppArgs & Scope, Nothing, Unit] =
    app.provideLayer(BaeldungLogger.slf4jLogger)
}
