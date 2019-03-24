package classes

/*
Runtime: 7340 ms, faster than 53.62% of Scala online submissions for Squares of a Sorted Array.
Memory Usage: 58.5 MB, less than 100.00% of Scala online submissions for Squares of a Sorted Array.
 */
class SquaresOfSorted {
  def sortedSquares(A: Array[Int]): Array[Int] = {
    var B:Array[Int] = A.map(rec=>rec*rec)
    B.sorted
  }
}
