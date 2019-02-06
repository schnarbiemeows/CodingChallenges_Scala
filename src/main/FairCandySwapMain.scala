package main
import classes.FairCandySwap

object FairCandySwapMain extends App {
  val sol = new FairCandySwap()
  val A:Array[Int] = Array(2)
  val B:Array[Int] = Array(1,3)
  val answer:Array[Int] = sol.fairCandySwap(A,B)
  println(answer(0),answer(1))
}
