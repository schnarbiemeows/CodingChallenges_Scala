package classes
/*
824 - EASY
not enough submissions to rank
 */
class GoatLatin {
  def toGoatLatin(S: String): String = {

    val words: Array[String] = S.split(" ")
    var newSentence = ""
    var i = 0
    for(i <- 0 to words.length-1) {
      var word: Array[Char] = words(i).toCharArray()
      var newword: Array[Char] = new Array[Char](word.length+3+i)
      word(0) match {
        case('a') => vowel(word,newword)
        case('e') => vowel(word,newword)
        case('i') => vowel(word,newword)
        case('o') => vowel(word,newword)
        case('u') => vowel(word,newword)
        case('A') => vowel(word,newword)
        case('E') => vowel(word,newword)
        case('I') => vowel(word,newword)
        case('O') => vowel(word,newword)
        case('U') => vowel(word,newword)
        case _ =>  consonant(word,newword)
      }
      newSentence+=String.valueOf(newword)+" "
    }
    return newSentence.substring(0,newSentence.length()-1)
  }
  def vowel(word: Array[Char], newword: Array[Char] ): Unit = {
    var i = 0
    for(i <- 0 to word.length-1) {
      newword(i)=word(i);
    }
    newword(word.length)='m';
    newword(word.length+1)='a';
    var j = word.length+2
    for(j <- word.length+2 to newword.length-1) {
      newword(j)='a';
    }
  }
  def consonant(word: Array[Char], newword: Array[Char] ) {
    var i = 1
    for(i <- 1 to word.length-1) {
      newword(i-1)=word(i);
    }
    newword(word.length-1)=word(0);
    newword(word.length)='m';
    newword(word.length+1)='a';
    var j = word.length+2
    for(j <- word.length+2 to newword.length-1) {
      newword(j)='a';
    }
  }

}
