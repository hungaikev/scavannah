object Demo27 {
  
  def calculateTax(rate: BigDecimal => BigDecimal, salary: BigDecimal) : BigDecimal = {
    rate(salary)
  }
  def kenyaTax  (salary: BigDecimal) = {
    calculateTax(x =>
      if (salary > 413201) salary * 0.396 else salary * 0.3, salary )
  }
  def  tzTax(salary: BigDecimal ) =
    calculateTax( _ * 0.25, salary)

  kenyaTax(413202)
  tzTax(100)


}