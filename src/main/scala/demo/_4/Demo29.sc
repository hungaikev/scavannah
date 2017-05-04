object Demo29 {

  def calculateTax(rate: BigDecimal => BigDecimal)  (salary : BigDecimal ) :  BigDecimal = {
    rate (salary)
  }
  def kenyaTax(salary : BigDecimal)  = calculateTax(x =>  if (x > 413201) x * 0.396 else x * 0.3 )(salary)

  def  tzTax(salary : BigDecimal) =  calculateTax( x =>  x * 0.25)(salary)

  kenyaTax(413202)
  tzTax(100)

}