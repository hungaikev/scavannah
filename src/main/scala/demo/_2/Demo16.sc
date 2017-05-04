object Demo16 {

  // Recursion
  def factorial(n: Int): BigInt = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  factorial(15)
  factorial(150)
  factorial(1500)
  // factorial(15000)

}