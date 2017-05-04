package demo._1

/**
  * Created by hungai on 5/4/17.
  */
object Demo2 extends App {

  val todayEvent = "Scavannah"
  val workshop = "Introduction to Scala"
  lazy val fun =
    (0 to 4).map(x => "fun").mkString(" ")

  println("Hello everybody!")
  print("Welcome to " + todayEvent + "!\n")
  println("I hope you can enjoy this workshop - "
    + workshop + ". :P")
  print("Scala is so much " + fun + "!")

}
