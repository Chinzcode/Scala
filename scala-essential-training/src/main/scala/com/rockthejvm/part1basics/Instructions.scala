package com.rockthejvm.part1basics

object Instructions {

  //instructions are executed vs expressions are evaluated
  //everything in Scala is an expression
  //in Scala, and instruction is a structure (expression) returning Unit

  val printing: Unit = println("This is an instruction") //side effect
  val theUnit: Unit = () //the only possible value of type Unit

  //instructions - code blocks returning Unit
  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  //variables in Scala
  var aVariable = 10
  aVariable = 40

  var aVariable_v2 = 20
  val reassignment: Unit = aVariable_v2 += 1

  //loops in Scala
  var theNumber = 1
  while (theNumber <= 10) {
    println(theNumber)
    theNumber += 1
  }

  def main(args: Array[String]): Unit = {

  }
}
