package com.rockthejvm.part2oop

object Inheritance {

  class VideoGame {
    val gameType = "interactive"
    def play(): Unit = println("game running!")
  }

  //single-class inheritance
  class Shooter extends VideoGame {
    def multiplayer(): Unit = {
      play()
      println("boom, boom!")
    }
  }

  val crysis = new Shooter

  //inherit ctor
  class Person(val name: String, age: Int)
  class Adult(name: String, age: Int) extends Person(name, age) //MUST specify ctor args

  val daniel = new Adult("Daniel", 99)

  //overriding = provide a new impl for methods in derived classes
  class RPG extends VideoGame {
    override val gameType = "role-playing"
    override def play(): Unit = println("level up!")
  }

  //subtype polymorphism
  val wow: VideoGame = new RPG //declare a value of a parent type, provide an instance of a derived type

  //anonymous classes
  val psychonauts = new VideoGame {
    override val gameType: String = "platformer"
  }

  def main(args: Array[String]): Unit = {
    println(crysis.gameType)
    crysis.multiplayer()
    println(daniel.name)
    println(wow.gameType)
    wow.play()
  }
}
