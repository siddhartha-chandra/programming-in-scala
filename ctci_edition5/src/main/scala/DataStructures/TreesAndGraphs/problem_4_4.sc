//Given a binary tree , design an algorithm that creates a linked list of all the nodes at each depth
case object Empty extends TreeNode[Nothing]
case class Node[A](value:A, l: TreeNode[A] = Empty, r: TreeNode[A] = Empty) extends TreeNode[A]
trait TreeNode[+A] {
  def getValue: Option[A] = this match {
    case n: Node[A] => Some(n.value)
    case Empty => None
  }

  def left: TreeNode[A] = this match {
    case n: Node[A] => n.l
    case _ => Empty
  }

  def right: TreeNode[A] = this match {
    case n: Node[A] => n.r
    case _ => Empty
  }

  override def toString: String = this match {
    case n: Node[A] =>
      s"""(${n.l}-${n.value}-${n.r})""".stripMargin
    case Empty => "."
  }





  def createLevelLinkedList[B>:A](depth: Int = 0,
                                  acc: Map[Int,List[B]] = Map[Int,List[B]]()): Map[Int,List[B]] = this match {
      case n: Node[B] => acc.isDefinedAt(depth)  match {
        case false => val newAcc = acc + (depth -> List(n.value))
                      val newAcc2 = this.left createLevelLinkedList(depth + 1, newAcc)
                      val res = this.right createLevelLinkedList(depth + 1, newAcc2)
                      res

        case true => val newAcc = acc + (depth -> (acc(depth) ++ List(n.value)))
                     val newAcc2 = this.left createLevelLinkedList(depth + 1, newAcc)
                     val res = this.right createLevelLinkedList(depth + 1, newAcc2)
                     res
      }

      case Empty => acc
    }

}


val tree = Node(value = 'a',
                l = Node('b',
                          Node('d',
                                Node('g'),
                                Node('h')),
                          Node('e',
                                Node('i'),
                                Node('j'))),
                r = Node('c',
                          Empty,
                          Node('f')))



val res = (tree createLevelLinkedList()).values.toList






























