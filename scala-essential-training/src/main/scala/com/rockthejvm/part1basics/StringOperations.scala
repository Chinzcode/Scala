package com.rockthejvm.part1basics

object StringOperations {

  //string
  val aString = "Scala Rocks"
  //functions attached to them (methods)
  val length: Int = aString.length
  val checkEmpty: Boolean = aString.isEmpty
  val startsWithScala: Boolean = aString.startsWith("Scala")
  val combine: String = aString + " very much!"
  val findIndex: Int = aString.indexOf("Rocks")

  //interpolation - inject values or expressions insidee a string
  val name = "Alice"
  val age = 12
  val greeting = s"Hi, my name is $name and I am $age years old." //s-interpolated string. .toString on every value
  val greeting_v2 = s"Hi, my name is $name and I will be turning ${age + 1} years old."


  def main(args: Array[String]): Unit = {

  }
}
