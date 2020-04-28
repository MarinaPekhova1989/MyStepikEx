

/*def fun(x: Double, y: Double) = (sqrt(x) + sqrt(y) / sqrt(x + y))

fun(4, -4)

def sqrtE(x: Double): Either[String, Double] =
  if (x < 0) Left(s"$x <0!") else Right(sqrt(x))

def divE(x: Double, y: Double): Either[String, Double] =
  if (y == 0) Left(s"Zero disvision!") else Right(x / y)

def funE(x: Double, y: Double): Either[String, Double] =
  sqrtE(x).flatMap { sx =>
    sqrtE(y).flatMap { sy =>
      sqrtE(x + y).flatMap { sxy =>
        divE(sx + sy, sxy)
      }
    }
  }

funE(4, 5)
funE(-2, 5)
funE(3, -4)
funE(0, 0)

def funEF(x: Double, y: Double): Either[String, Double] =
  for {
    sx <- sqrtE(x)
    sy <- sqrtE(y)
    sxy <- sqrtE(x + y)
    result <- divE(sx + sy, sxy)
  } yield result

funEF(4, 5)
funEF(-2, 5)
funEF(3, -4)
funEF(0, 0)*/

def service1(x: Double): Either[String, Double] = if (x == 0) Left(s"0") else Right(x * 2)
def service2(res1: Double): Either[String, Int] = if (res1.toInt < 2) Left(s"NO") else Right((res1 / 3).toInt)
def service3(x: Double): String = s"Yes $x"
def service4(res1: Double, res2: Int, res3: String): Either[String, String] =
  if (res1 != 0 && res1 != 0) Left("YOU")
  else Right(s"$res3")

def result(x: Double): Either[String, String] =
  for {
    sx <- service1(x)
    sy <- service2(sx)
    sz <- service3(x)
    sr <- service4(sx, sy, sz.toString)
  } yield sz

result(3.9)