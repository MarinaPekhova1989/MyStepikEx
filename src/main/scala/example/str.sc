

/*def main(num: Array[String], word: Array[String]) {
  val line: String = scala.io.StdIn.readLine()
  val startIndex = Character.getNumericValue(line(0))
  val endIndex = Character.getNumericValue(line(2))
  val sentence:  String = scala.io.StdIn.readLine()
  val lenght_s = sentence.length()
  val sub1 = sentence.slice(0, startIndex)
  val sub2 = sentence.slice(startIndex, endIndex + 1)
  val sub3 = sentence.slice(endIndex + 1, lenght_s + 1)
  val res: String = sub1 + sub2.reverse + sub3
  res
}*/

var stringArray: Array[String] = Array("2", " ", "6", " ", "foobarbaz")

//main(Array("2", " ", "6"), Array("foobarbaz"))

val num:String = "21 26"
val popo = num.split("\\s")
val a = popo(0).toInt
val b = popo(1).toInt
val d = "foobarbaz"
val length = d.length
val c = d.slice(0, a )
val e = d.slice(a , b + 1)
val f = d.slice(b + 1, length + 1)
val res = c + e.reverse + f
val ex = "fobraboaz"
