package ucsc

object call_by_name {
  def main(args:Array[String])
  {
    delayed(time());
  }
  def time()={
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed(t:Long)={
    println("Indelayed method")
    println("Param:"+t)
  }
}