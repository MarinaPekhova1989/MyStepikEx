

def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
  if (p._2 == 0 || q._2 == 0 || q._1 == 0) Left("Zero divisor")
  else if ((math.abs(p._1) >= math.abs(p._2)) || (math.abs(q._1) >= math.abs(q._2))) Left("Invalid input")
  else if ((math.abs(p._1 * q._2)) >= (math.abs(p._2 * q._1))) Left("Improper result")
  else Right(((p._1 * q._2) / ((p._1 * q._2) * (euclid((p._1 * q._2), (p._2 * q._1))._1) + (p._2 * q._1) * (euclid((p._1 * q._2), (p._2 * q._1))._2))), (p._2 * q._1) / ((p._1 * q._2) * (euclid((p._1 * q._2), (p._2 * q._1))._1) + (p._2 * q._1) * (euclid((p._1 * q._2), (p._2 * q._1))._2)))
}

def euclid(a: Int, b: Int): (Int, Int) = {
  if (b == 0) (1, 0)
  else {
    val d = a / b
    val r = a % b
    val (x, y) = euclid(b, r)
    (y, x - d * y)
  }
}



/*def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
  (p, q) match {
    case ((p1, p2), (q1, q2)) if p1 >= p2 || q1 >= q2 => Left("Invalid input")
    case ((_,  p2), (q1, q2)) if p2 == 0 || q2 == 0 || q1 == 0 => Left("Zero divisor")
    case ((p1, p2), (q1, q2))  => (math.abs(p1*q2) -> math.abs(p2*q1)) match {
      case (pr, qr) if pr >= qr => Left("Improper result")
      case (pr, qr) => Right(gcd(pr -> qr)
    }
  }
}*/

divide(1, 0)(1, 2)
divide(1, 2)(1, 0)
divide(1, 2)(0, 2)

divide(3, 4)(1, 10)
divide(1, 2)(1, 2)

divide(2, 1)(1, 7)
divide(1, 2)(7, 1)
divide(1, 1)(2, 2)
divide(2, 1)(3, 1)

divide(1, 2)(2, 3)
divide(-1, 2)(2, 3)
divide(1, -2)(2, 3)
divide(1, 2)(-2, 3)
divide(1, 2)(2, -3)
divide(2, 4)(4, 5)

val divide10: PartialFunction[Int, Int] = {
  case 1 => 10
  case 2 => 5
  case 5 => 2
  case 10 => 1
}

divide10(2)

def flatten(options: List[Option[Int]]): List[Int] = {
  options.map{case Some(s) => s}
}