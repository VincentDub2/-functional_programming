// Databricks notebook source
// Databricks notebook source
def f(x:Int): Int = x * 2 
def g(x:Int): Int = x + 2
def h(x:Int):Int = f(g(x))

val input = 4 
println(f(input))
println(g(input))
println(h(input))

// COMMAND ----------

// COMMAND ----------

val name: String = "Scala"
val age: Int = 25

// COMMAND ----------

// COMMAND ----------

val language : Int = "Scala"

// COMMAND ----------

// COMMAND ----------

def add(x:Int , y:Int):Int = x + y
val sum = add(10,20)
println(s"Sum is : $sum")


// COMMAND ----------

// COMMAND ----------

val x = 10 
val y = 20 
val z = x + y

// COMMAND ----------

// COMMAND ----------

val z = x.+(y)

// COMMAND ----------

// COMMAND ----------

trait Shape {
  def area() : Int
}

class Square(length:Int) extends Shape {
  def area = length * length 
}

class Rectangle(length:Int, width:Int) extends Shape {
  def area = length * width
}

val square = new Square(10)
val area = square.area

// COMMAND ----------

// COMMAND ----------

val twoElements = ("10", true)
val threeElements =  ("10", "harry", true)


// COMMAND ----------

// COMMAND ----------

val first = threeElements._1
val second = threeElements._2
val third = threeElements._3


// COMMAND ----------

// COMMAND ----------

val arr = Array(10,20,30,40)

// COMMAND ----------

// COMMAND ----------

arr(0) = 50


// COMMAND ----------

// COMMAND ----------

val first = arr(0)

// COMMAND ----------

// COMMAND ----------

val xs = List(10,20,30,40)


// COMMAND ----------

// COMMAND ----------

val ys = (1 to 100).toList

// COMMAND ----------

// COMMAND ----------

val zs = arr.toList


// COMMAND ----------

// COMMAND ----------

val zs = arr.toList

zs.head
zs.tail
zs.isEmpty


// COMMAND ----------

// COMMAND ----------

val v1 = Vector(0,10,20,30,40)
val v2 = v1 :+ 50
val v3 = v2 :+ 60

// COMMAND ----------

// COMMAND ----------

val fruits = Set("apple", "orange", "pear", "banana")

fruits.isEmpty

// COMMAND ----------

// COMMAND ----------

val capitals = Map("France" -> "Paris", "USA" -> "Washington D.C", "UK" -> "London")

val FranceCapital = capitals("France")


// COMMAND ----------

// COMMAND ----------

val myList = List(1,2,3,4)

val myAnotherList = myList.map(_* 10.0)


// COMMAND ----------

// COMMAND ----------

val interType = myList.map {x => x * 10.0}

val functionLiteral = myList.map {_ * 10.0}

// COMMAND ----------

// COMMAND ----------

val line = "Scala is fun"

// COMMAND ----------

val SingleSpace = " "

// COMMAND ----------

val words = line.split(SingleSpace)

// COMMAND ----------

// COMMAND ----------

val arrayOfListOfChars = words.map{x => x.toList}

// COMMAND ----------

val myNewList = (1 to 100).toList

// COMMAND ----------

val even = myNewList.filter(_ % 2 == 0)

// COMMAND ----------

// COMMAND ----------

val words = "Scala is fun".split("")

// COMMAND ----------

words.foreach(println)

// COMMAND ----------

// COMMAND ----------

val reduceList = List(2,4,6,8,10)

// COMMAND ----------

val sum = reduceList.reduce((x,y) => x + y)
val product = reduceList.reduce((x,y) => x * y)

