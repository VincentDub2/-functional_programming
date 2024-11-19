// Databricks notebook source
val addOne = (x: Int) => x+1
print(addOne(1))

// COMMAND ----------

def add(x:Int,y: Int): Int = x + y
print(add(1,2))//3

// COMMAND ----------

def addThenMultiply(x:Int,y: Int)(multiplier: Int): Int = (x + y)* multiplier
println(addThenMultiply((1,2)(3)))

// COMMAND ----------

class Greeter(prefix: String, suffix: String){
  def greet(name: String): Unit =
    println(prefix + name + suffix)
}

// COMMAND ----------

val greeter = new Greeter("Hello, ","!")
greeter.greet("Scala developper")//Hello, Scala developer!

// COMMAND ----------

case class Point(x: Int, y: Int)

// COMMAND ----------

val point = Point(2,3)
val point2 = Point(4,2)
val point3 = Point(7,3)

// COMMAND ----------

if(point == point2) {
  println(s"$point and $point2 are the same")
}

// COMMAND ----------

class DefaultGreeter extends Greeter
class CustomizableGreeter(prefix: String,postfix:String) extends Greeter {
  override def greet(){}
}
