val list1 = List(1, 3, 5, 7)
val list2 = List(2, 3, 6, 8)
val list3 = List(1, 3, 5, 8, 10, 12, 14)

/*for { x <- Some(1) ; y <- None } yield (x, y)



for { x <- Some(1) ; y <- Left("year") } yield x + y

for { x <- Some(2); y <- List(1,2,3,4) } yield x + y

for { (k,v) <- Map("a" -> 1, "b" -> 2) } yield k

for { x <- List(1,2,3,4) } x*/

for { x <- List(1,2,3,4) } x

/*for {x <- list1; y <- list2; z <- list3; if x * y == z && x != y}
  print("\n"+("("+x +"," + y+")"))*/

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}


val iterator = new IntIterator(10)
iterator.next()  // вернет 0
iterator.hasNext  // вернет 1

case class Book( book: String)

