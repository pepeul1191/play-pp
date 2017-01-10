package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TestController @Inject() extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.test())
  }
}
