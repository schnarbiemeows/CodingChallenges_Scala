package main
import classes.GoatLatin
/*
824 - EASY
not enough submissions to rank
 */
object GoatLatinMain extends App{
  val gl = new GoatLatin()
  val input = "The quick brown fox jumped over the lazy dog"
  System.out.println(gl.toGoatLatin(input))
}
