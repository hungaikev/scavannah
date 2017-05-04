object Demo23a {

  abstract class Notification
  case class Email(sourceEmail: String, title: String, body: String) extends Notification
  case class SMS (sourceNumber: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  val emailNotification = Email("h@hungaikev.in","Some Email","Get the job")



  sealed abstract class Expr
  case class Add(first: Expr, second: Expr) extends Expr
  case class Sub(first: Expr, second: Expr) extends Expr
  case class Multi(first: Expr, second: Expr) extends Expr
  case class Div(first: Expr, second: Expr) extends Expr
  case class Value(n: Int) extends Expr

  //Pattern Matching

  def calculate(combination: Expr): Int = {
    combination match {
      case Add(first, second) => calculate(first) + calculate(second)
      case Sub(first, second) => calculate(first) - calculate(second)
      case Multi(first, second) => calculate(first) * calculate(second)
      case Div(first, second) => calculate(first) / calculate(second)
      case Value(n) => n
    }
  }
  // (((2 + 1) * 3) - 1) / 4
  val exp = Div(Sub(Multi(
    Add(Value(1), Value(2)), Value(3)), Value(1)), Value(4))
  calculate(exp)
}