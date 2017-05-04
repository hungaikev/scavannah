object Demo15 {

  def min(k: Int, w: Int): Int = {
    def max(x: Int, y: Int) = {
      if (x > y) x
      else y
    }

    if (k >= max(k, w))
      w
    else
      k
  }

  min(2,5)


  def min2(x: Int, y: Int): Int = {
    def max = {
      if (x > y) x
      else y
    }

    if (x >= max) y else x
  }

  min2(2,5)

}