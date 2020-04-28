package example

object Hello extends App {
  val text = Stream.continually(scala.io.StdIn.readLine()).takeWhile(_ != "END").mkString("\n").split("\n").toList
  val numbers = text.zipWithIndex.filter(t => t._2 % 2 != 0).map(_._1.toInt * 2).sum
  println(numbers)
}