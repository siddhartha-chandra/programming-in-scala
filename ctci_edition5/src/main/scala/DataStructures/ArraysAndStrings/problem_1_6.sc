//Given an image represented by N X N matrix, where each pixel in the image is 4 bytes,
// write a method to rotate the image by 90 degrees. Can you do this in place?

type Matrix = Array[Array[Char]]

def displayMatrix(m: Array[Array[Char]]) = {
  m.indices.foreach{i=>
    val row = m.indices.map{j=> m(i)(j)}
    println(row.mkString(" "))
  }
}

def rotate(matrix: Matrix): Matrix = {
  val lastIndex = matrix.length - 1

  val isEven = matrix.length%2 == 0
  def updateMatrix(currentIndex: Int) = {
    val last = lastIndex - currentIndex
    val range = currentIndex until last
    range.foreach{ rng =>
      val temp = matrix(currentIndex)(rng)

      //top swap
      matrix(currentIndex)(rng) = matrix(last-rng)(currentIndex)

      //left swap
      matrix(last-rng)(currentIndex) = matrix(last)(last-rng)

      //bottom swap
      matrix(last)(last-rng) = matrix(rng)(last)

      //right swap
      matrix(rng)(last) = temp
    }
  }
  val indices = isEven match {
    case false => 0 until (lastIndex/2)
    case true => 0 until (lastIndex/2) +1
  }
  indices.foreach{i=>
    updateMatrix(i)
  }
  matrix
}

  //pr1.6 - rotation of N X N matrix
  val m1 = Array(Array('1','2','3'), Array('4','5','6'), Array('7','8','9'))
  val m2 = Array(Array('1','2'), Array('3','4'))
  val m3 = Array(Array('a','b','c','d'),
    Array('e','f','g','h'),
    Array('i','j','k','l'),
    Array('m','n','o','p')
  )

  println("Before rotation:")
  displayMatrix(m1)
  println("After rotation:")
  displayMatrix(rotate(m1))

  println()

  println("Before rotation:")
  displayMatrix(m2)
  println("After rotation:")
  displayMatrix(rotate(m2))

  println()

  println("Before rotation:")
  displayMatrix(m3)
  println("After rotation:")
  displayMatrix(rotate(m3))








