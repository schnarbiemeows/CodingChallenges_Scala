package classes

/*
1005
difficulty : EASY

 */
class MaxSumArrayAfterKNegations {
  def largestSumAfterKNegations(A: Array[Int], K: Int): Int = {
    scala.util.Sorting.quickSort(A)
    var index:Int = 0
    var k=K
    while(A(index)<0&&k>0) {
      A(index)=0-A(index)
      index+=1
      k-=1
    }
    if(k%2==1) {
      scala.util.Sorting.quickSort(A)
      A(0)=0-A(0)
    }
    var sum:Int = 0
    var a = 0
    for(a <- 0 to A.length-1) {
      sum+=A(a)
    }
    return sum
  }
}
