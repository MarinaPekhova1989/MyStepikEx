val m = Map("a1" -> "1", "b2" -> "2", "c3" -> "3")
val someList = List("b", "d")
m.filterNot { case (k,v) => someList.exists(l => k.startsWith(l)) }

