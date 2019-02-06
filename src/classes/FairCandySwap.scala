package classes
/*
888, difficulty - EASY
beat 66.67% of submissions, no memory feedback, but at least it gave some feedback
 */
class FairCandySwap {
  def fairCandySwap(A: Array[Int], B: Array[Int]): Array[Int] = {
    val nums = A.toSet
    var account:Int = A.sum
    var bcount:Int = B.sum
    val diff:Int = Math.abs(account-bcount)/2
    for(b <- B) {
      var count:Int = 0
      if(account>bcount) count=b+diff
      else count=b-diff
      if(nums.contains(count)) return Array(count,b)
    }
    return Array(0,0)
  }
}
/*
solution I found online for this problem

object Solution {
  def fairCandySwap(A: Array[Int], B: Array[Int]): Array[Int] = {
    val (sumA, sumB, setB) = (A.sum, B.sum, B.toSet)
    // condition: guaranteed an answer exists, means eventually sumA'==sumB'
    // then totalSum = sumA'+sumB' = 2sumA', which is even, so divide 2 is still int
    val targetSum = (sumA + sumB) / 2
    for (a <- A) {
      val b = targetSum - (sumA - a) // targetSum - others
      if (setB.contains(b)) return Array(a, b)
    }
    Array(0, 0)
  }
}
 */