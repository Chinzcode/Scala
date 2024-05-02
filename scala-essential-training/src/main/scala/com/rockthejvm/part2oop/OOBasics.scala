package com.rockthejvm.part2oop

object OOBasics {

  //classes and instances
  class Person(val name: String, age: Int) {
    val allCaps: String = name.toUpperCase()

    def greet(someone: String): String =
      s"$name says: Hi $someone"

    def greet(): String =
      s"Hi Everyone, I'm $name"
  }

  val daniel = new Person("Daniel", 99)
  val danielName = daniel.name //ctor arg is not (necessarily) a field. To access val or var needs to be defined

  /*
    Exercises: app for car registration
    - Create a Car and a Driver class

    Driver: first name, last name, year of birth
      - method full name

    Car: make, model, year of release, owner
      - method ownerAge
      - method isOwnedBy(driver: Driver) - boolean if the driver is the same as the owner
      - copy (newYearOfRelease) - returns a new Car instance with the same data except the new year of release
   */

  class Driver(firstName: String, lastName: String, val birthYear: Int) {
    def fullName(): String =
      s"$firstName $lastName"
  }

  class Car(make: String, model: String, releaseYear: Int, owner: Driver) {
    def ownerAge(): Int =
      releaseYear - owner.birthYear

    def isOwnedBy(driver: Driver): Boolean =
      driver == owner

    def copy(newYearOfRelease: Int): Car =
      new Car(make, model, newYearOfRelease, owner)
  }

  def main(args: Array[String]): Unit = {
    println(daniel.allCaps)
    println(daniel.greet("Alice"))
    println(daniel.greet())
    //test exercise
    val driver = new Driver("Michael", "Schumacher", 1969)
    val driverImpostor = new Driver("Michael", "Schumacher", 1969)

    val car = new Car("Ferrari", "F1", 2004, driver)

    println(driver.fullName())
    println(car.ownerAge())
    println(car.isOwnedBy(driver))
    println(car.isOwnedBy(driverImpostor))
    println(car.copy(2005).ownerAge())
    println(s"testing equality: ${driver == driverImpostor}")
  }
}
