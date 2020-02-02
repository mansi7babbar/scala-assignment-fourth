class Person(val name:String, val age:Int) extends Ordered[Person] {
  def compare(that:Person): Int = {
    if(this.name == that.name) {
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}

object Person extends App {
  val firstPersonName = scala.io.StdIn.readLine("Enter first person's name: ")

  print("Enter first person's age: ")
  val firstPersonAge = scala.io.StdIn.readInt()

  val secondPersonName = scala.io.StdIn.readLine("\nEnter second person's name: ")

  print("Enter second person's age: ")
  val secondPersonAge = scala.io.StdIn.readInt()

  val firstPerson = new Person(firstPersonName, firstPersonAge)
  val secondPerson = new Person(secondPersonName, secondPersonAge)

  val comparisonOperation = scala.io.StdIn.readLine("\nEnter comparison operation < OR > : ")

  val comparisonOutput = comparisonOperation match {
    case "<" => firstPerson < secondPerson
    case ">" => firstPerson > secondPerson
    case _ => "Comparison operation not defined"
  }

  println(comparisonOutput)
}
