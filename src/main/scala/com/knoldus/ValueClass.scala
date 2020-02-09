class FirstName(val fname: String) extends AnyVal {
  def displayFirstName: String = fname
}

class LastName(val lname: String) extends AnyVal {
  def displayLastName: String = lname
}

class Age(val age: Int) extends AnyVal {
  def displayAge: Int = age
}

object Display extends App {

  val fname = scala.io.StdIn.readLine("Enter first name of the person: ")
  val lname = scala.io.StdIn.readLine("Enter last name of the person: ")
  print("Enter age of the person: ")
  val age = scala.io.StdIn.readInt()

  def displayDetails(firstNameObject: FirstName, lastNameObject: LastName, ageObject: Age): String = {
    val fname = firstNameObject.displayFirstName
    val lname = lastNameObject.displayLastName
    val age = ageObject.displayAge
    s"$fname $lname is of $age years"
  }

  println(displayDetails(new FirstName(fname), new LastName(lname), new Age(age)))

}
