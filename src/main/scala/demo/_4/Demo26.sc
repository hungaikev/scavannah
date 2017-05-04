object Demo26 {

  def calculateTax(rate: BigDecimal => BigDecimal, salary: BigDecimal) : BigDecimal = {
    rate(salary)
  }
  val kenyaTax = (salary: BigDecimal) => {
    if (salary > 413201) salary * 0.396 else salary * 0.3
  }
  val tzTax: BigDecimal => BigDecimal = _ * 0.25


  calculateTax(kenyaTax,413201)
  calculateTax(tzTax,100)

}