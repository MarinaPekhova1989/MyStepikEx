class Foo {
  protected class Bar(bar1: Int) {
    private[this] val bar2: Boolean = true
  }

  val foo1 = new Bar(20) // 1
  final val foo2: Int = 30
}

class Qux extends Foo {
  override val foo1 = new Bar(200) // 3
}

val a = new Foo
a.foo1 // 6
a.foo2 // 8

val b = new Qux
b.foo1 // 9