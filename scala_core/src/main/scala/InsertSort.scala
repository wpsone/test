import scala.collection.mutable
import scala.util.control.Breaks

object InsertSort {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(4, 12, 6, 3, 8, 9, 5)
    val ab: mutable.Buffer[Int] = array.toBuffer

    val arrSort: List[Int] = isort(array.toList)

    println(arrSort)

    // 创建Breaks对象
//    val forLoop = new Breaks
//
//    for (i <- 1 until ab.length) {
//      val value_i: Int = ab(i)
//
//      // 把需要可能break的代码放在 breakable 中执行
//      forLoop.breakable {
//        for (j <- 0 to i-1) {
//          val value_j: Int = ab(j)
//          if (value_j>value_i) {
//            ab.remove(i,1)
////            println("i"+i+"="+ab)
//            ab.insert(j,value_i)
////            println("j"+j+"="+ab)
//            // 使用break进行跳出
//            forLoop.break()
//          }
//        }
//      }
//    }
//    println(ab)


  }

  def isort(xs:List[Int]):List[Int] = if (xs.isEmpty) Nil else insert(xs.head,isort(xs.tail))

  def insert(x:Int,xs:List[Int]):List[Int] = if (xs.isEmpty||x<=xs.head) x::xs else xs.head::insert(x,xs.tail)
}
