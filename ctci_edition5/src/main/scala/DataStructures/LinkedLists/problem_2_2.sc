//Implement an algorithm to find the kth to last element of a
// singly linked list

import java.util.Calendar

def drop[A](k: Int, ls: List[A]):Option[List[A]] = ls match {
  case Nil if k > 0 => None
  case _ if k==0 => Some(ls)
  case h::t => drop(k-1,t)
}

def findKthToLast[A](k: Int, ls: List[A]) = {
  val listAdvancedByK = drop(k, ls)

  def findKthToLastInternal(rem: List[A], remK: List[A]): Option[A] = remK match {
    case Nil => rem.headOption
    case h::t if k!= 0 => findKthToLastInternal(rem.tail, t)
    case _ => None
  }

  val res = listAdvancedByK match {
    case None => throw new Exception("Invalid K!")
    case _ => findKthToLastInternal(ls, listAdvancedByK.get)
  }
  res
}

val ls = (1 to 1000).toList
val ks = List(0,1,2,3,4,5,6)
val k = 4

val start = Calendar.getInstance()
val startMillis = start.get(Calendar.MILLISECOND)
val res = findKthToLast(k,ls)
val stop = Calendar.getInstance()
val endMillis = stop.get(Calendar.MILLISECOND)
val totalTimeTaken = endMillis - startMillis
println("Total time taken : "+ totalTimeTaken.toDouble/1000 +" seconds")

println(s"The ${k}th element from last is:")
res match {
  case Some(x) => println(x)
  case _ => println("None")
}












