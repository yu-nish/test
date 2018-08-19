package exceptionhandler


import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import StatusCodes._
import akka.http.scaladsl.server._
import Directives._


trait MyImplicitExceptionHandler {

  implicit def myExceptionHandler: ExceptionHandler =
    ExceptionHandler {
      case _: ArithmeticException =>
        extractUri { uri =>
          println(s"Request to $uri could not be handled normally")
          complete(HttpResponse(InternalServerError, entity = "Bad numbers, bad result!!!"))
        }
    }
}