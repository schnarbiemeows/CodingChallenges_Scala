package classes

/*
Runtime: 5504 ms, faster than 17.65% of Scala online submissions for Sum of Even Numbers After Queries.
Memory Usage: 78.8 MB, less than 100.00% of Scala online submissions for Sum of Even Numbers After Queries.
 */
class SumEvenNumAfterQueries {
  def sumEvenAfterQueries(A: Array[Int], queries: Array[Array[Int]]): Array[Int] = {
    var output:Array[Int] = new Array[Int](A.length)
    var index:Int = 0
    for(i<-0 to queries.length-1) {
        var total:Int = 0
        A(queries(i)(1))+=queries(i)(0)
        for (j <- 0 to A.length - 1) {
          if(A(j)%2==0)
            total+=A(j)
        }
        output(index)=total
        index+=1
      }
    return output
  }
}
