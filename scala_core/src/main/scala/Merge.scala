object Merge {

  def merge(left: List[Int],right: List[Int]):List[Int] = (left,right)
  match {
    case (Nil,_) => right
    case (_,Nil) => left
    case (x::xTail,y::yTail) =>
      if (x<=y) x::merge(xTail,right)
      else y::merge(left,yTail)
  }

}
