object List_map{
  def main(args:Array[String]): Unit ={
    val list = List(1, 2, 3)
    val f = (i:Int)=>println(i)
    list.foreach(f)
    val univresity = Map("XMU"->"Xiamen University", "THU"->"Tsinghua University")
    univresity foreach{kv => println(kv._1 + ":" + kv._2)}
  }
}
