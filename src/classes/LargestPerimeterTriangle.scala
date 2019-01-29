package classes

class LargestPerimeterTriangle {
  /*
  Ha, beat 100% of scala submissions!
   */
  def largestPerimeter(A: Array[Int]): Int = {
    scala.util.Sorting.quickSort(A)
    var k = A.length-1
    var answer = 0
    while(k>1&&(A(k)>=A(k-1)+A(k-2))) {
      k-=1
    }
    if(k>1) {
      answer = A(k)+A(k-1)+A(k-2)
    }
    answer
  }
}
