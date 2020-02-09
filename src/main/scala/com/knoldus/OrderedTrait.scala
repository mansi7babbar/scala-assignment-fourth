package com.knoldus

class OrderedTrait(val name: String, val age: Int) extends Ordered[OrderedTrait] {
  def compare(that: OrderedTrait): Int = {
    if (this.name == that.name) {
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}

object OrderedTrait extends App {
  val firstPersonName = scala.io.StdIn.readLine("Enter first person's name: ").toLowerCase

  print("Enter first person's age: ")
  val firstPersonAge = scala.io.StdIn.readInt().abs

  val secondPersonName = scala.io.StdIn.readLine("Enter second person's name: ").toLowerCase

  print("Enter second person's age: ")
  val secondPersonAge = scala.io.StdIn.readInt().abs

  val firstPerson = new OrderedTrait(firstPersonName, firstPersonAge)
  val secondPerson = new OrderedTrait(secondPersonName, secondPersonAge)

  println("Enter comparison operation: \n" +
    "1. `this` is less than `that`\n" +
    "2. `this` is greater than `that`\n" +
    "3. `this` is less than or equal to `that`\n" +
    "4. `this` is greater than or equal to `that`")
  val comparisonOperation = scala.io.StdIn.readInt()

  val comparisonOutput = comparisonOperation match {
    case 1 => firstPerson < secondPerson
    case 2 => firstPerson > secondPerson
    case 3 => firstPerson <= secondPerson
    case 4 => firstPerson >= secondPerson
    case _ => "Comparison operation not defined"
  }

  println(comparisonOutput)
}
