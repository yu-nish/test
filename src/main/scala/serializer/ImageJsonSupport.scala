package serializer

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol
import entities.Image



trait ImageJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val PortoFolioFormats = jsonFormat2(Image)
}
object ImageJsonSupport extends ImageJsonSupport