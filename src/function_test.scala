import java.io.File

import scala.io.Source
import collection.mutable.Map
import scala.collection.mutable

object function_test {
  def main(args:Array[String]): Unit ={
    val dirfile = new File("src/testFiles")
    val files = dirfile.listFiles
    print(files)
    val results = mutable.Map.empty[String, Int]
    for(file <- files){
      val data = Source.fromFile(file)
      val strs = data.getLines.flatMap{s => s.split(" ")}
      strs foreach(word =>
        if(results.contains(word))
        results(word) += 1 else results(word)=1)
    }
    results foreach{case (k, v) => println(s"$k:$v")}


  }
}
