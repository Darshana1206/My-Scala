package ucsc

object lists {
  def main(args:Array[String])
  {
    var myList:List[String] = List("Nimal","Kamal","Sunil")
    println(myList)
    
    var newList:List[Int] = List(12,56,8,5,96,15)
    println(newList(3))
    println()
    for(i<-newList) //print list by using forloop
    {
      println(i)
    }
    println()
    myList.foreach(println)//print a list using foreach loop
    println()
    var sum = 0
    newList.foreach(sum+=_)
    println("Sum= "+sum)
    println()
    
    println("******List functions*****")
    println(newList.sum)
    println(newList.head)
    println(myList.last)
    println(myList.tail)
    println(newList.contains(41))
    println(newList.reverse)
    println(2::newList)
    println(Nil)
    
  }
}