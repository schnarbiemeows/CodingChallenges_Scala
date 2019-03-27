package main
import classes.SumEvenNumAfterQueries
/*
985, difficulty -EASY
We have an array A of integers, and an array queries of queries.
For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].
Then, the answer to the i-th query is the sum of the even values of A.
(Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)
Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 */
object SumEvenNumAfterQueriesMain {
  def main(args:Array[String]): Unit = {
    var input:Array[Int] = Array(1,1,1,1)
    var queries:Array[Array[Int]] = Array(Array(2,0),Array(-2,1),Array(-4,0),Array(2,3))
    var solution = new SumEvenNumAfterQueries()
    var output:Array[Int] = solution.sumEvenAfterQueries(input,queries)
    output.foreach(println)
  }
}
