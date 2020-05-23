import scala.io.StdIn._
import java.io.PrintWriter
// 2.3.2 构造器
//class Counter(var name:String)
//class Counter2{
//  private var value = 0
//  private var name = ""
//  private var step = 1
//  println("the main constructor")
//  def this(name:String){
//    this()
//    this.name = name
//    printf("the first auxiliary constructor, name: %s\n",name)
//  }
//
//  def this(name:String, step:Int){
//    this(name)
//    this.step = step
//    printf("the second auxiliary constructor, name: %s, step: %d\n", name, step)
//
//  }
//  def increment(step:Int):Unit={value += step}
//  def current():Int = {value}
//}
//object test {
//  def main(args: Array[String]){
////    var mycounter = new Counter("Runner")
////    mycounter.name = "setter"
////    println(mycounter.name)
//    //val c2 = new Counter2("the 2nd constructor")
//    val c3 = new Counter2("the 3rd Counter", 2)
//    c3.increment(3)
//    print(c3.current())
//  }
//
//}

//2.3.3 对象(单例对象)
//class Person(val name:String){
//  private val id = Person.newPersonId()
//  def info(): Unit ={
//    printf("The id of %s is %d.\n", name, id)
//  }
//}
//object Person{
//  private var lastId = 0
//  def newPersonId():Int={
//    lastId += 1
//    lastId
//  }
//  def main(args:Array[String]): Unit ={
//    val person1 = new Person("Lilei")
//    val person2 = new Person("Hanmeimei")
//    person1.info()
//    person2.info()
//  }
//}
//object test{
//  def main(args:Array[String]): Unit ={
//    printf("1: %d\n", Person.newPersonId())
//    printf("2: %d\n", Person.newPersonId())
//    var id = new Person("classPerson")
//    id.info()
//  }
//}

//2.3.4 对象(apply方法)
//class TestApplyClass{
//  def apply(param:String): Unit ={
//    println("apply method called: " + param)
//  }
//}
//
//object test{
//  def add=(x:Int, y:Int)=>x+y
//  def main(args:Array[String]): Unit ={
//
////    val myObject = new TestApplyClass
////    myObject("Hello Apply")
////    myObject.apply("Hello Apply2")
//    val num = add(4,6)
//    print(num)
//}
//}
//
//class Car(name:String){
//  def info(): Unit ={
//    println("Car name is: "+ name)
//  }
//}
//object Car{
//  def apply(name:String) = new Car(name)
//}
//2.3.5对象(update，unapply方法)
//class Car(val brand:String, val price:Int){
//  def info(): Unit ={
//    println("Car brand is "+ brand + "and price is "+price)
//  }
//}
//object Car{
//  def apply(brand:String, price:Int): Car ={
//    println("Debug:calling apply ...")
//    new Car(brand, price)
//  }
//  def unapply(c:Car):Option[(String, Int)]={
//    println("Debug:calling unapply ...")
//    Some((c.brand, c.price))
//  }
//}
//object test{
//  def main(args:Array[String]): Unit ={
////    var Car(carbrand, carprice)=Car("BMW", 800000)
////    println("brand:" + carbrand + "and price:" + carprice)
//    val arr = new Array[String](3)
//    arr(0) = "BigData"
//    var a = 0
//    for (a <- 0 to 2){
//      print(arr(a))
//    }
//  }
//}
//2.3.6继承
//abstract class Car{
//  val carBrand:String
//  def info()
//  def greeting(): Unit ={
//    println("Welcome to my car!")
//  }
//}
//
//class BMWCar extends Car{
//  val carBrand: String = "BMW"
//  def info(): Unit ={
//    printf("This is a %s carr. It is expensive.\n", carBrand)
//  }
//
//  override def greeting(): Unit = {
//    println("Welcome to my BMW car!")
//  }
//}
//
//class BYDCar extends Car{
//  val carBrand: String = "BYD"
//  def info(): Unit ={
//    println("This is a %s car. It is cheap.\n"+ carBrand)
//  }
//
//  override def greeting(): Unit = {
//    println("Welcome to my BYD car!")
//  }
//}
//
//object test{
//  def main(args:Array[String]): Unit ={
//    val myCar1 = new BMWCar()
//    val myCar2 = new BYDCar()
//    myCar1.greeting()
//    myCar1.info()
//    myCar2.greeting()
//    myCar2.info()
//  }
//}
//2.3.8 模式匹配
//case class Car(brand:String, price:Int)
//object test{
//  def main(args:Array[String]): Unit ={
////    println("Please input the score: ")
////    val grade = readChar()
////    grade match {
////      case 'A'=>println("85-100")
////      case 'B'=>println("100-150")
////      case  _ =>println("error input!")
////    }
////    println("Please input a country: ")
////    val country = readLine()
////    country match{
////      case "China"=>println("中国")
////      case "America"=>println("美国")
////      case "Japan"=>println("日本")
////      case _=>println("我不认识！")
////    }
//    val myBYDCar = Car("BYD", 89000)
//    val myBMWCar = Car("BMW", 120000)
//    val myBenzCar = Car("Benz", 150000)
//    for(car<-List(myBYDCar, myBMWCar, myBenzCar)){
//      car match {
//        case Car("BYD", 89000)=>println("Hello, BYD!")
//        case Car("BMW", 120000)=>println("Hello, BMW!")
//        case Car(brand, price)=>println("Brand:"+brand+", Price:"+price+", do you want it?")
//      }
//    }
//  }
//}
//2.4.1函数定义与使用
object test{
  def main(args:Array[String]): Unit ={
    val myNumFunc: Int=>Int=num=>num * 2
    println(myNumFunc(3))
    val myNumFunc1 = (num:Int)=> num * 2
    println(myNumFunc1(4))
    val counter = (_:Int) + 1
    //高阶函数
    def sum(f:Int=>Int, a:Int, b:Int):Int={
      if(a > b) 0 else f(a) + sum(f, a + 1, b)
    }
    val a = 1
    val b = 5
    print(sum(x=>x * x, a, b))
  }
}