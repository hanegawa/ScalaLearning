object List_map{
  def main(args:Array[String]): Unit ={
    val list = List(1, 2, 3)
    val f = (i:Int)=>println(i)
    list.foreach(f)
  }
}
