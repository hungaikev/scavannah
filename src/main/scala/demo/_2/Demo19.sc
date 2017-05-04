object Demo19 {

  def matchString(x: String) = {
    x match {
      case "Dog" => x
      case "Cat" => "Not a Cat person"
      case _ => "Neither Dog or Cat"
    }
  }

  matchString("Dog")
  matchString("Cat")
  matchString("Human")

}