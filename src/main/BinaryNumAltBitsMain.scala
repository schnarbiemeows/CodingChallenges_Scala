package main
import classes.BinaryNumAltBits
/*
# 693, difficulty - EASY
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 */
object BinaryNumAltBitsMain extends App{
  val solution = new BinaryNumAltBits()
  val num = 10
  val answer:Boolean = solution.hasAlternatingBits(num)
  println(answer)
}
