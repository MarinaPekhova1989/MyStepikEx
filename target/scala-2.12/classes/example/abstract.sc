abstract class User(name: String) {
  def friends: List[User]

  def friendOfFriends =
    (for {
      friend <- friends
      friend2 <- friend.friends if friend2 != this
    } yield friend2).distinct

  override def toString = name
}

lazy val oleg: User = new User(name = "Oleg") {
  def friends: List[User] = List(katya, masha)
}

lazy val katya: User = new User(name = "Katya") {
  def friends: List[User] = List(oleg, anton)
}

lazy val masha: User = new User(name = "Masha") {
  def friends: List[User] = List(katya, anton)
}

lazy val anton: User = new User(name = "Anton") {
  def friends: List[User] = List(katya, masha)
}

oleg.friends
oleg.friendOfFriends


trait StringProcessor {
  def process(input: String): String
}


  def main(args: Array[String]) {



     val toLowerConvertor = new StringProcessor {
      override def process(args: String): String = {
        val lowerCase = args.toLowerCase()
        lowerCase
      }
    }
     val tokenDeleter = new StringProcessor {
      override def process(toLowerConvertor: String): String = {
        val withouPuntc = toLowerConvertor.replaceAll("[^a-zA-Zа-яА-Я]", " ")
        withouPuntc
      }
    }
    val shortener =
      new StringProcessor {
        override def process(tokenDeleter: String): String = {
        val cut = tokenDeleter.splitAt(19)
          cut._1
        }
      }
  }

val line = "This is a Wonderful Test!"
val cut = line.splitAt(19)
cut._1

val newLine = line.replaceAll("[^a-zA-Zа-яА-Я]", " ")
newLine.split("\\s+")
line.toLowerCase()