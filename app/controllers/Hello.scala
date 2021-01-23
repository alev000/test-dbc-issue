package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import org.apache.spark.sql.SparkSession

@Singleton
class Hello @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def mainPage: Action[AnyContent] = Action {
    val spark = SparkSession
      .builder()
      .master("local[*]")
      .getOrCreate()
    val results = spark.read.load("dbfs:/mnt/data/zetio/run/20201101.1/lookup/variant.type.lookup.parquet")
      .limit(100)
      .collect()
    Ok(results.mkString("\n"))
  }
}
