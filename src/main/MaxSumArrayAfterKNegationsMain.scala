package main
import classes.MaxSumArrayAfterKNegations

/*
1005, difficulty - EASY
Given an array A of integers, we must modify the array in the following way:
we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.
(We may choose the same index i multiple times.)
Return the largest possible sum of the array after modifying it in this way.
 */
object MaxSumArrayAfterKNegationsMain {
  def main(args: Array[String]) = {
    val solution = new MaxSumArrayAfterKNegations()
    var input = Array(-8,3,-5,-3,-5,-2)
    var num:Int = 6
    println(solution.largestSumAfterKNegations(input,num))
  }
}
/*
solution : we can sort because we only need a sum, so array positions don't matter
also, if the number to be reversed is positive, then the new number would subtract from the total,
so we would want the smallest positive numbers
as well, if the number to be reversed were negative, it would add to the total, so, again,
we would want the smallest number, because that would add the greatest amount to the total
so, 2 steps:
1. sort the array
2. for the first num items, reverse the sign
3. total the array
ok, no, because you can chose any index multiple times, so you could reverse and index and then
reverse it again
Ok, so, we would still sort the array
1. sort the array
then, for any negative numbers, reverse then starting with the smallest one until either
you run out of num, or you run out of negatives
2. reverse the negatives smallest to greatest
if you have any num left over, if numleft%2==0, then we are done, because single reversing any
number(except zero) would result in a subtraction from the total, so we would want to do a second
reverse on any number we reversed to undo this subtraction. double reversing would just negate this,
so we can simply numleft if it is an even number
if numleft%0==1, then just reverse the smallest non-negative number, as this would result in the
smallest subtraction from the total
3. if numleft%2==1, reverse smallest non-negative number
 */