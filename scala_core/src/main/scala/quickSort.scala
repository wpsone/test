/**
 * 快排
 * 时间复杂度:平均时间复杂度为O(nlogn)
 * 空间复杂度:O(logn)，因为递归栈空间的使用问题
 */
object quickSort {

  def quickSort(list: List[Int]):List[Int] = list match {
    case Nil => Nil
    case List() => List()
    case head::tail =>
      val (left,right) = tail.partition(_ < head)
      quickSort(left):::head::quickSort(right)
  }

}
