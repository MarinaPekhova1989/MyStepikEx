class Waiter(val name: String, var order: List[String]) {
  println(s"My name $name")

  def giveMe(food: String): Waiter = {
    order = (food :: this.order).reverse
    this
  }

  def complete(): List[String] = this.order
}

val waiter = new Waiter("иван", List())
val positions = waiter.giveMe("борщ").giveMe("хлеб").giveMe("булгур").complete()

/*class Waiter (val name:String, var order:List[String]){
  println("My name " + name)

  def giveMe(dish:String):Waiter = {
    this.order=(dish :: this.order).reverse
    this
  }
  def complete():List[String] = this.order