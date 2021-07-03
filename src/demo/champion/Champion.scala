package demo.champion

import demo.traits.ChampionTrait

case class Champion(var name: String, var roll: String) extends ChampionTrait{
  def kill(): Unit = {
    if (roll == "tank") {
      println("Deal 50 damage")
    }
    else if (roll == "assassin") {
      println("Deal 1000 damage")
    }
    else if (roll == "figher") {
      println("Deal 500 damage")
    }
    else if (roll == "marksman") {
      println("Deal 2000 damage")
    }
    else {
      println("cannot deal damage")
    }
  }

  def recall(): Unit = {
    if (roll == "tank") {
      println("Boom boom !!")
    }
    else if (roll == "assassin") {
      println("Slash slash !!")
    }
    else if (roll == "figher") {
      println("Flwwwww !!!")
    }
    else if (roll == "marksman") {
      println("peww pewwww !!")
    }
    else {
      println("cannot recall")
    }
  }
}
