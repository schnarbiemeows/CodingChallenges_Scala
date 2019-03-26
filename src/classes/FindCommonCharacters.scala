package classes
import scala.collection.mutable.ListBuffer
/*
Runtime: 316 ms, faster than 77.27% of Scala online submissions for Find Common Characters.
Memory Usage: 49.7 MB, less than 100.00% of Scala online submissions for Find Common Characters.
 */
class FindCommonCharacters {
  def commonChars(A: Array[String]): List[String] = {
    if(A.length==1) return List()
    var letterArray = Array.ofDim[Int](A.length,26)
    var counter:Int = 0
    for(letter:String <- A) {
      val chars:Array[Char] = letter.toCharArray
      for(character:Char<-chars) {
        letterArray(counter)(character-97)+=1
      }
      counter+=1
    }
    var answer:ListBuffer[String] = new ListBuffer[String]()
    for(i <- 0 to 25) {
      var min:Int = letterArray(0)(i)
      for(j<-1 to A.length-1) {
        min = Math.min(min,letterArray(j)(i))
      }
      for(k<-0 to min-1) {
        val character:String = (i+'a').toChar.toString()
        answer += character
      }
    }
    return answer.toList
  }
}
