package com.rockthejvm.part2oop

object Objects {

  //singleton pattern
  object MySingleton { //MySingleton type AND the ONLY possible instance of that type
    //can define fields and methods
    val aField = 45
    def aMethod(x: Int) = x + 1
  }

  val theSingleton = MySingleton
  val anotherSignleton = MySingleton

  //combo of class + object of the same name in the same file = companions
  class Person(name: String) {
    def sayHi(): String = s"Hi, my name is $name"
  }

  object Person { //object with the same name = companion object
    //define "static" fields and methods that don't depend on a particular instance of the class
    val N_EYES = 2
    def canFly(): Boolean = false
  }

  //objects can extend classes/traits
  object BigFoot extends Person("Big Foot")

  /*
  Scala compiles to JVM bytecode
  class with a static void main(args: Array[String])

  class MyApplication {
    public static void main(String[] args {}
  }

  Scala equivalent:
  object MyApplication {
    def main(args: Array[String]): Unit = {...}
  }
   */

  def main(args: Array[String]): Unit = {
    println(theSingleton == anotherSignleton)
    println(MySingleton.aField)
    println(theSingleton.aField)
    println(MySingleton.aMethod(4))
    println(Person.N_EYES)
    println(Person.canFly())
  }
}
