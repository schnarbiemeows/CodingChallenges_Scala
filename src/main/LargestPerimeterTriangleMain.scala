package main
import classes.LargestPerimeterTriangle
/*
# 976, difficulty - EASY
Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area,
formed from 3 of these lengths.
If it is impossible to form any triangle of non-zero area, return 0.
 */
object LargestPerimeterTriangleMain extends App{
  val solution = new LargestPerimeterTriangle
  var myList = Array(2,1,1,8,2,4,5,3,4,6,6,6)
  val answer: Int = solution.largestPerimeter(myList)
  println(answer)
}