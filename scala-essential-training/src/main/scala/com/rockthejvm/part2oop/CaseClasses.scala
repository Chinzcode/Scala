package com.rockthejvm.part2oop

object CaseClasses {

  //lightweight data structures
  case class Pet(name: String, age: Int) {
    //define fields and methods
  }

  // 1 - class ctor args auto promoted to fields = case class Pet(val name: String, val age: Int) {...}
  val dino = new Pet("Dino", 2)
  val dinoAge = dino.age

  // 2 - case classes can be built without the "new" keyword
  val dino_v2 = Pet("Dino", 2) // new is not required

  // 3 - toString, equals, hashCode (Any type)
  class PetSimple(name: String, age: Int)
  val dinoSimple = new PetSimple("Dino", 2)
  val dinoSimple_v2 = new PetSimple("Dino", 2)

  // 4 - utility methods e.g copy
  val dinoYounger = dino.copy(age = 1) //new instance of Pet with the same data, EXCEPT the arg I pass

  // 5 - they have companion objects already created, with an apply method with the same signature as the ctor
  val dino_v3 = Pet("Dino", 3) //same as Pet.apply("Dino", 3)

  // 6 - they are serializable - for parallel/distributed systems
  // 7 - they are eligible for pattern matching

  // case objects
  case object UnitedKingdom {
    def name: String = "the uk of gb and ni"
  }

  //define hierarchies of data structures, some are their own types
  trait Message
  case class InitialInteraction(message: String) extends Message
  //other case classes
  case object EndConversation extends Message

  //pattern matching
  def getMessage(): Message =
    InitialInteraction("hello")

  val message: Message = getMessage()
  val contents = message match {
    case InitialInteraction(someContent) => s"I have received: $someContent"
    case EndConversation => "end of chat"
  }


  def main(args: Array[String]): Unit = {
    println(dinoSimple.toString)
    println(dino.toString)
    println(dino == dino_v2)
    println(dinoSimple == dinoSimple_v2)
    println(dinoYounger)
    println(contents)
  }
}
