package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class Hello @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def mainPage: Action[AnyContent] = Action {
    Ok("Hello, Play world!")
  }  
}
