trait QueueFunctions {
  def enqueueOperation(list:List[Int], element:Int) : List[Int] = {
    list:+element
  }
  def dequeueOperation(list:List[Int]) : List[Int] = {
    list.tail
  }
}

class DoubleQueue extends QueueFunctions {
  override def enqueueOperation(list:List[Int], element:Int) : List[Int] = {
    list:+(element * 2)
  }
}

class SquareQueue extends QueueFunctions {
  override def enqueueOperation(list:List[Int], element:Int) : List[Int] = {
    list:+(element * element)
  }
}

object Queue extends App {
  val doubleQueueObject = new DoubleQueue()
  println(doubleQueueObject.enqueueOperation(List(2,4,6,8),5))
  println(doubleQueueObject.dequeueOperation(List(2,4,6,8,10)))

  val squareQueueObject = new SquareQueue()
  println(squareQueueObject.enqueueOperation(List(2,4,9,16),5))
  println(squareQueueObject.dequeueOperation(List(2,4,9,16,25)))
}
