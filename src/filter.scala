object filter{
  def main(args:Array[String]): Unit ={
    val university = Map(
      "XMU" -> "Xiamen University",
      "THU" -> "Tsinghua University",
      "HIT" -> "Harbin Institude of Technology"
    )
    val hits = university filter{kv => kv._2 contains "Harbin"}
    print(hits)
    val l = List(1,2,3,4,5,6) filter{ _ % 2 == 0}
    print(l)
    println()
    print("规约")
    val list = List(1,2,3,4,5)
    //val res = list.reduce(_ + _)
    val res = list.sum
    println(res)
    //val res2 = list.reduce(_ * _)
    val res2 = list.product
    println(res2)
    val res4 = list reduceLeft(_ - _)
    println(res4)
    val res5 = list reduceRight(_ - _)
    print(res5)
    val res6 = list.fold(10)(_ * _)
    println(res6)

  }
}
