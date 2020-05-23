object List_map{
  def main(args:Array[String]): Unit ={
    val list = List(1, 2, 3)
    val f = (i:Int)=>println(i)
    list.foreach(f)
    val university = Map("XMU"->"Xiamen University", "THU"->"Tsinghua University")
    university foreach{kv => println(kv._1 + ":" + kv._2)}
//    university foreach{x=>x match {case (k, v) => println(k + ":" + v)}}
    university foreach{case (k, v) => println(k + ":" + v)}
    val books = List("Hadoop", "Hive", "HDFS")
    val length = books.map(s => s.length)
    print(length)
    books foreach{item => println(item)}

    //flatmap:一对多映射
    val newList = books flatMap(s => s.toList)
    print(newList)
    newList foreach(item => println(item))
  }
}
