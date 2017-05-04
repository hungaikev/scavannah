object Demo28 {

  //Returns a function

  def calculateTax(rate: BigDecimal => BigDecimal) : (BigDecimal ) => BigDecimal = {
    rate
  }
  def kenyaTax  = calculateTax(x =>  if (x > 413201) x * 0.396 else x * 0.3 )

   def  tzTax =  calculateTax( x =>  x * 0.25)

  kenyaTax(413202)
  tzTax(100)

  calculateTax(kenyaTax)(413202)
  calculateTax(tzTax)(100)


}