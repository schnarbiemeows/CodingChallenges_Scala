package classes
/*
interesting, there are not enough scala submissions to give me a ranking
 */
class BinaryNumAltBits {
  def hasAlternatingBits(n: Int): Boolean = {
    if(n==1) return true
    var num = n
    var init = n%2
    num=num>>>1
    while(num>0) {
      if(num%2==init) return false
      init=num%2
      num=num>>>1
    }
    return true
  }
}
