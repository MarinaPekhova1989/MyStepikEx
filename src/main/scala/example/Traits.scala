package example

class Traits {
  trait StringProcessor {
    def process(input: String): String
  }

  object Main {
    def main(args: Array[String]) {
      val sentence =  Stream.continually(scala.io.StdIn.readLine()).takeWhile(_ != "END").mkString("\n").split("\n").toString

      val toLowerConvertor = new StringProcessor {
        override def process(sentence: String): String = {
          val lowerCase = sentence.toLowerCase()
          lowerCase
        }
      }
      val tokenDeleter = new StringProcessor {
        override def process(toLowerConvertor: String): String = {
          val withouPuntc = toLowerConvertor.replaceAll("[^a-zA-Zа-яА-Я]", " ")
          withouPuntc
        }
      }
      val shortener: StringProcessor =
        new StringProcessor {
          override def process(tokenDeleter: String): String = {
            val dots = "..."
            val cut = tokenDeleter.splitAt(19)
            val result = cut._1 + dots
            result
          }
        }
      print (shortener.process(tokenDeleter.process(toLowerConvertor.process(sentence))))
    }
  }
}

