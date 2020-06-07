package Error

object Practise {
  
  def main(array:Array[String])
  {
    
    print("Enter the number of rows: ")
    var x =scala.io.StdIn.readInt()
    
    
    print("Enter the number of coloumns: ")
    var y:Int=scala.io.StdIn.readInt()
    //println()
    
    var myArr=Array.ofDim[Int](x,y)
    
    for(i<-0 until x)
    {
      for(j<- 0 until y)
      {
        myArr(i)(j)=scala.io.StdIn.readInt() 
      }
    }
    for(i<-0 until x)
    {
      for(j<- 0 until y)
      {
        print(" "+myArr(i)(j)) 
      }
      println()
    }
  }
  
} 

