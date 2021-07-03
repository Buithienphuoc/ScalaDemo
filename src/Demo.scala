import java.util

object Demo {

  val championList: util.List[String] = new util.ArrayList[String]()
  championList.add("Akali")
  championList.add("Anivia")
  championList.add("Singed")
  championList.add("Cho'gath")

  def main(args: Array[String]) {
    println("Hello Chika Chikuku")
    val name: String = "Phuoc"
    val favoriteFramework: String = "Apache Spark"
    println("My name is:" + name + " and I want to learn " + favoriteFramework)
    forLoopDemo()
    classDemo()
    lambdaExpressionDemo()
  }

  def forLoopDemo(): Unit = {
    println("This is the list of my favorite LOL champions")
    // For loop demo
    for (index <- 0 until championList.size()) {
      print(championList.get(index))
      if (index != championList.size() - 1) {
        print(",")
      }
      else {
        println()
      }
    }
  }

  def classDemo(): Unit = {
    val champion: Champion = Champion("Akali", "assassin")
    val champion2: Champion = Champion("Shen", "tank")
    println("When " + champion.name + " and " + champion2.name + " want to kill:")
    champion.kill()
    champion2.kill()
    println(champion)
    println(champion2)
  }

  def lambdaExpressionDemo(): Unit = {
    println("This is the list of my favorite LOL champions")
    championList.forEach(name => {
      print(name)
      if (championList.indexOf(name) == championList.size() - 1) {
        println()
      }
      else {
        print(",")
      }
    })
  }
}
