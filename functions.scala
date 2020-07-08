package ucsc

object functions {
  def main(args:Array[String])
  {
    var anonymous=(x:Int,y:Int)=>x+y // Anonymous functions
    println(anonymous(4,8))
    
    higher_order(5,6,add) // call to higher order function
    
    println(sum(4)(5)) // call to currying function
    println(sub(5)(2))
  }
  def higher_order(x:Int,y:Int,f:(Int,Int)=>Int) //higher order function
  {
   var value=f(x,y)
   println(value)
  }
  def add(a:Int,b:Int)=
  {
    a+b
  }
  def sum(x:Int)=(y:Int)=>x+y // currying function way 1
  def sub(x:Int)(y:Int)=x-y // currying function way 2
}