package x

object B1 {

  def not_called(): Unit = {
    println("hello world")
  }

  def calledByOtherTest(): Unit = {
    println("sup")
  }

}
