object Demo18 {
  import scala.annotation.tailrec

  def factorial(n: Int): BigInt = {
    @tailrec
    def helpFunction(acc: BigInt, n: Int): BigInt = {
      if (n == 0)
        acc
      else
        helpFunction(acc * n, n - 1)
    }
    helpFunction(1, n)
  }

  factorial(15)
  factorial(150)
  factorial(1500)
  factorial(15000)

}