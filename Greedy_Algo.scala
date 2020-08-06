package Error

object Greedy_Algo {
  def main(args:Array[String])={
    println("Enter the number of children:")
    var n:Int=scala.io.StdIn.readInt()
    
    var marks = new Array[Int](n)
    println("Enter the marks:")
    
    for(i<-0 to (n-1))
    {
      marks(i)= scala.io.StdIn.readInt()
    }
//    var marks=Array(2,4,1,5)
//    var n=marks.length
    var masks = new Array[Int](n);
    
    for(i<-0 until n)
    {
      masks(i)=1
    }
    
    for(i<-0 until (n-1))
    {
      if(marks(i+1)>marks(i))
      {
        masks(i+1)=masks(i)+1
      }
    }
    
    for(i<-(n-1) until 0 by -1)
    {
      if((marks(i-1)>marks(i)) && (masks(i-1)<=masks(i)))
      {
        masks(i-1)=masks(i)+1
      }
    }
    println("Number of masks for each student:")
    for(i<-masks)
    {
      print(i+" ")
    }
    println()
    var sum:Int=0
    masks.foreach(sum+=_)
    println ("Total masks:"+sum)
  }
}