import org.apache.spark.sql.{DataFrame, SparkSession}

@main
def main(): Unit = {
  // Configuration de SparkSession avec MongoDB
  val spark = SparkSession.builder()
    .appName("MongoDB JSON Import")
    .config("spark.mongodb.write.connection.uri", "mongodb+srv://mikadobetterave0s:qOIwZCI7joB3CvRo@fp.ejosi.mongodb.net/NEOJ")
    .getOrCreate()

  // Lecture d'un fichier JSON dans un DataFrame Spark
  val jsonPath = "path/to/your/file.json" // Remplacez par le chemin de votre fichier JSON
  val jsonDF: DataFrame = spark.read.json(jsonPath)

  // Afficher le contenu du DataFrame pour vérification
  println("Données JSON chargées :")
  jsonDF.show()

  // Écriture des données JSON dans MongoDB
  jsonDF.write
    .format("mongodb")
    .option("collection", "your_collection_name") // Nom de la collection cible
    .mode("overwrite") // Modes possibles : overwrite, append, etc.
    .save()

  println("Les données JSON ont été poussées avec succès dans MongoDB.")

  // Arrêter SparkSession
  spark.stop()
}