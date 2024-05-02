package com.rockthejvm.part2oop

object MethodNotation {

  class Person(val name: String) {
    infix def greet(another: Person): String =
      s"$name says: Hi, ${another.name}, how are you?"

    def apply(progLang: String): Unit =
      println(s"$name likes programming in $progLang")

    def apply(progLang: String, algorithm: String): Unit =
      println(s"$name likes programming in $progLang, applying the algorithm $algorithm")
  }

  val alice = Person("Alice")
  val bob = Person("Bob")

  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice greet bob) //exactly the same thing - infix notation
    //infix notation only works on methods with ONE argument

    alice.apply("Scala")
    alice("Scala") //same as alice.apply("Scala")
    alice("Scala", "Dynamic Programming")
  }
}
