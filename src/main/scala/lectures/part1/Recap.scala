package lectures.part1

// Only needed things are registered:
object Recap extends App {

  // 1 Anonymous classes

  // Scala allows the creation of classes "on the spot"
  val myNumber = new Number {
    override def intValue(): Int = 32

    override def longValue(): Long = 32L

    override def floatValue(): Float = 32.0F

    override def doubleValue(): Double = 32.0
  }

  println(myNumber.doubleValue())
  // end

  // 2 Functional Programming:

  // Functions are instances of classes with an apply method
  val incrementerBy1 = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  println(incrementerBy1(3))

  // Syntactic sugar that reduces to instances of Function[...] classes
  val anonymousIncrementer = (x: Int) => x + 1

  // end









}
