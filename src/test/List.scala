package test

/**
 * Created by semanticer on 1. 12. 2015.
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def size: Int
  def nth(n: Int): T
  def add(v: T): List[T] = ???

}

  class Cons[T](val head: T, val tail: List[T]) extends List[T] {
    def isEmpty = false

    def size: Int = ???

    def nth(n: Int): T = {
      ???
    }
  }

  class Nil[T] extends List[T] {
    def isEmpty: Boolean = true
    def tail: List[T] = throw new NoSuchElementException("Nil.head")
    def head: T = throw new NoSuchElementException("Nil.tail")
    def size: Int = 0
    def nth(n: Int): Nothing = throw  new IndexOutOfBoundsException
  }

  object List {
    def singleton[T](v: T) = new Cons[T](v, new Nil[T])
  }

