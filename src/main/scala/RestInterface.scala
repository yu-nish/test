import scala.concurrent.ExecutionContext
import akka.http.scaladsl.server.Route
import exceptionhandler.MyImplicitExceptionHandler
import resources.TensorFlowResources
import service.ImageService

trait RestInterface extends Resources with MyImplicitExceptionHandler{
  implicit def executionContext: ExecutionContext

  lazy val imService = new ImageService
  val routes: Route =  imageRoutes
}

trait Resources extends TensorFlowResources