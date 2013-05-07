package utils

import play.api.libs.concurrent.Execution.Implicits.defaultContext




import reactivemongo.api.gridfs.GridFS
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.ReactiveMongoPlugin

/** Mongo connection object */
object Mongo {

  def db = ReactiveMongoPlugin.db
//  val driver = new MongoDriver
//  val connection = driver.connection(List("heroku_app15540830:3gmmfhcf3f0kn31gbqet7djesr@ds063177.mongolab.com:63177"))
//  val db = connection("heroku_app15540830")

  def accessLog: JSONCollection = db.collection[JSONCollection]("accessLog")

  val imagesGridFS = new GridFS(db, "images")
}