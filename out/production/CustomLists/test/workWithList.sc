import test._
import test.Cons

val myList = new Cons(4, new Cons(9, new Cons(2, new Nil)))

myList.nth(0)

val n = myList.add(8)
n.nth(0)

val nil: List[Int] = new Nil[Int]

val newNil = nil.add(1)

newNil.nth(0)

