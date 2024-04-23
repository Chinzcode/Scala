package com.rockthejvm.part1basics

object Expressions {

  //structures that evaluate to a value
  val meaningOfLife: Int = 40 + 2
  //                       ^^^^^^ expression

  //expressions that compose + - * / , bitwise | & >> <<
  val mathExpression: Int = 2 + 3 * 4 //14

  //boolean expressions
  val equalityTest: Boolean = 1 == 2 //expression returns true or false

  //if expressions
  val anIfExpression: Int = if (equalityTest) 45 else 99
  val anIfExpression_v2: Int = if equalityTest then 45 else 99

  //code blocks are also expressions
  val aCodeBlock: Int = {
    //can define local values
    val localValue = 78
    //a bunch of expressions

    //last value = the value of the ENTIRE BLOCK
    localValue + 99
  }

  //everything in Scala is an expression
  //indentation syntax
  val aCodeBlock_v2: Int =
    //can define local values
    val localValue = 78
    //a bunch of expressions

    //last value = the value of the ENTIRE BLOCK
    localValue + 99

  //pattern matching - "switch on steroids"
  val someValue = 42
  val description = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "meaning of life"
    case _ => "something else"
  }

  def main(args: Array[String]): Unit = {
    println(description)
  }
}
