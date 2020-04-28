import scala.util.matching.Regex

//val input: List[String] = List("Oleg", "oleg@email.com", "7bdaf0a1be3","7bdaf0a1be3","7bdaf0a1be3")
//val input: List[String] = List("Oleg ol@gmail.com", "asdasdasdasd","7bdaf0a1be3","7bdaf0a1be3")
//val input: List[String] = List("Oleg gmail.com", "asdasdasdasd","7bdaf0a1be3","7bdaf0a1be3")
//val input: List[String] = List("Oleg gmail.com", "7bdaf0a1be3", "a8af118b1a2", "28d74b7a3fe")
//val input: List[String] = List("Oleg ol@gmail.com")
//val input: List[String] = List("Oleg ol@gmail.com", "asdasdasdasd")
val input: List[String] =List("Oleg ol@gmail.com", "asdasdasdasd", "asdasdasdasd", "asdasdasdasd", "asdasdasdasd", "asdasdasdasd")
val name: Regex = "([a-zA-Z]+)".r
val email: Regex = "(\\w+@)?(\\w+.\\w+)".r
val nameEmail: Regex = "([a-zA-Z]+\\s)(\\w+@)?(\\w+.\\w+)".r

val a: String = "\"invalid\""
val result = input
match {
  case List(ne, _, _, _) => s"${nameEmail.findAllIn(ne).group(1)}" + s"${nameEmail.findAllIn(ne).group(3)}"
  case List(n, e, _, _, _)  => s"${name.findAllIn(n).group(1)}" + " " + s"${email.findAllIn(e).group(2)}"
  case List(ne, _, _) => s"${nameEmail.findAllIn(ne).group(1)}" + s"${nameEmail.findAllIn(ne).group(3)}"
  case List(n, e, _, _)  => s"${name.findAllIn(n).group(1)}" + " " + s"${email.findAllIn(e).group(2)}"
  case List(ne, _) => s"${nameEmail.findAllIn(ne).group(1)}" + s"${nameEmail.findAllIn(ne).group(3)}"
  case List(n, e, _)  => s"${name.findAllIn(n).group(1)}" + " " + s"${email.findAllIn(e).group(2)}"
  case List(ne) => s"${nameEmail.findAllIn(ne).group(1)}" + s"${nameEmail.findAllIn(ne).group(3)}"
  case List(n, e)  => s"${name.findAllIn(n).group(1)}" + " " + s"${email.findAllIn(e).group(2)}"
  case _ => a
}
print(result)