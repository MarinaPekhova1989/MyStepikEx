
def kOrder(list: List[Int], k: Int): Int = {
  val mid = list.length / 2
  val (left, right) = list.partition(_ <= list.apply(mid))
  val leftLength = left.length
  leftLength match {
    case x if leftLength == k => list(mid)
    case x if k < leftLength => kOrder(left.tail, k)
    case _ => kOrder(right, k - leftLength)
  }
}

/*def kOrder(list: List[Int], k: Int): Int = {
  val (left, right) = list.partition(_ <= list(0))
  val leftLen = left.length
  if (leftLen == k){
  else if (leftLen < k){
  kOrder(right, k - leftLen)}
  else {
  kOrder(left.tail, k)}
}*/

kOrder(List(3, 8, 1, 12, 23), 2)

val nums = List.range(0, 10)
val alpha = 'A' to 'Z'

val nams2 = nums.map(i => alpha(i))
val nums3 = nums.map(alpha)


val charLists: List[Char] =
  nums.collect {
    case i if i % 2 == 0 => alpha(i / 2 * 3)
    case 3 => '_'
    case 5 | 7 => '!'
  }

val charlists: List[List[Char]] = nums.map(i => List(alpha(i), alpha(i + 3)))

val charList: List[Char] = charlists.flatten

val chars: List[Char] = nums.flatMap(i => List(alpha(i), alpha(i + 3)))


lazy val primes: Stream[Long] = 2L #:: Stream.iterate(3L)(_ + 2L).filter(isPrime)
////Stream.from(2).takeWhile(p => p * p <= x).forall(x % _ != 0)


def isPrime(x: Long): Boolean =
  primes.takeWhile(p => p * p <= x).forall(x % _ != 0)

primes.take(10).force

isPrime(13)

primes.take(10).toList
primes.take(10).force
primes.take(10).force.sum

val list = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)

list.foreach(println)
val newList = list.takeWhile(p => p < 100)
val newList1 = newList.collect { case x if x % 4 == 0 => x }
val newList2 = newList1.map { case x => x / 4 }
val newList3 = newList2.init
newList3.foreach(println)



