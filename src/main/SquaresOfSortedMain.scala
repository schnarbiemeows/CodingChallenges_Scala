package main

import classes.SquaresOfSorted
/*
977, difficulty - easy
Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number, also in sorted non-decreasing order.
 */
object SquaresOfSortedMain {

  def main(args:Array[String]) = {
    val solution = new SquaresOfSorted()
    var input:Array[Int] = Array(-7,-3,2,3,11)
    val answer = solution.sortedSquares(input)
    answer.foreach(println)
  }
}
