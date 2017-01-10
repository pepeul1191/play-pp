package controllers.accesos

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class MenuController @Inject() extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.accesos.menu())
  }
}
