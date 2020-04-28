object Main {
  def main(args: Array[String]) {
    def kOrder(list: List[Int], k: Int): Int = {
      val head +: rest = list
      val (sm, hi) = rest.partition(_ <= head)
      sm.length match {
        case x if x == k - 1 => head
        case x if x > k - 1 => kOrder(sm, k)
        case _ => kOrder(hi, k - sm.length - 1)
      }
    }
    val k = readInt()
    print(kOrder(readLine().split(" ").toList.map(_.toInt),k))
  }}

val list: List[Int] = List(1,2,3,4,1,2,3)

val pivot = list(list.length / 2)
val head +: rest = list
val (left, right) = list.partition(_ <= list(0))
