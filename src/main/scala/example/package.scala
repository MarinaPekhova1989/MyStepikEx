package object example
  import scala.io.StdIn

  object Main {
    def main(args: Array[String]) {
      //val line1: String = scala.io.StdIn.readLine()
      val line1: String = args.toString
      val line = line1.replaceAll("\\s+","")
      val startIndex = Character.getNumericValue(line(0))
      val endIndex = Character.getNumericValue(line(1))
      val sentence: String = StdIn.readLine()
      val lenght_s = sentence.length()
      val sub1 = sentence.slice(0, startIndex)
      val sub2 = sentence.slice(startIndex, endIndex + 1)
      val sub3 = sentence.slice(endIndex + 1, lenght_s + 1)
      val massString = sentence.split(sub2)
      val res: String = sub1 + sub2.reverse + sub3
      println(res)
    }
  }
