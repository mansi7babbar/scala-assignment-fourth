package com.knoldus

trait QueueFunctions {
  def enqueueOperation(list: List[Int], element: Int): List[Int] = {
    list :+ element
  }

  def dequeueOperation(list: List[Int]): List[Int] = {
    list.tail
  }
}

package queueOperations {

  class DoubleQueue extends QueueFunctions {
    override def enqueueOperation(list: List[Int], element: Int): List[Int] = {
      list :+ (element * 2)
    }
  }

  class SquareQueue extends QueueFunctions {
    override def enqueueOperation(list: List[Int], element: Int): List[Int] = {
      list :+ (element * element)
    }
  }

}

object TraitPackage extends App {

  val list: List[Int] = List(1, 2, 3, 4, 5)

  println("Enter the element to be inserted: ")
  val inputElement = scala.io.StdIn.readInt()

  val doubleQueueObject = new com.knoldus.queueOperations.DoubleQueue()
  println("List after inserting double of input element: " + doubleQueueObject.enqueueOperation(list, inputElement))
  println("List after deleting first element: " + doubleQueueObject.dequeueOperation(list))

  val squareQueueObject = new com.knoldus.queueOperations.SquareQueue()
  println("List after inserting square of input element: " + squareQueueObject.enqueueOperation(list, inputElement))
  println("List after deleting first element: " + squareQueueObject.dequeueOperation(list))

}
