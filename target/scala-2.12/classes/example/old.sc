import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
  // your code here
  val a = weight - (crispsWaterRatio * potatoWaterRatio) // 9
  val k = crispsWaterRatio * a // 0.9
  val u = a / k // 1E+1
  val c: BigDecimal=u.setScale(5, HALF_UP) // 10.00000
  c
}



crispsWeight(90.0, 0.9, 0.1
)

crispsWeight(100.0, 0.99, 0.98
)

def crispsWeight1(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
  val a: BigDecimal = potatoWaterRatio
  val b: BigDecimal = crispsWaterRatio
  val x: BigDecimal = (weight - weight * (a - b) / (1 - b))
  return x.setScale(5,HALF_UP)
}

crispsWeight1(90.0, 0.9, 0.1
)

crispsWeight1(100.0, 0.99, 0.98
)


crispsWeight1(50.0, 0.91, 0.11
)

crispsWeight1(100.0, 0.919, 0.981
)