package ucsc

object map {
  def main(arg:Array[String])
  {
    var info:Map[Int,String]=Map(1->"Darshana",2->"Ravindu",3->"Bandara")
    println (info)
    
    println(info(2))
    info+=4->"Kavishka"
    println(info)
    
    info.keys.foreach{i=>
           //println()
      print("keys : "+i+" ")
      println("value = "+info(i))
    }
     println(info.keys)
     println(info.values)
     println(info.isEmpty)
     println(info.contains(1))
     println(info.contains(5))
  }
}