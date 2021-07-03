case class Champion(var name:String, var roll:String){
  def kill(): Unit ={
    if(roll == "tank"){
      println("Deal 50 damage")
    }
    else if(roll == "assassin"){
      println("Deal 1000 damage")
    }
    else if(roll == "figher"){
      println("Deal 500 damage")
    }
    else if(roll == "marksman"){
      println("Deal 2000 damage")
    }
    else {
      println("cannot deal damage" )
    }
  }
}
