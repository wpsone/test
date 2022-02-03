package com.wps

object Scala99 {

  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 9) {
//      var flag:String ="\t"
//      for (j <- 1 to i) {
//        if (i==j) {
//          flag="\n"
//        }
//        print(i+"*"+j+"="+i*j+flag)
//      }
//    }

    for (i <- 1 to 9;j <- 1 to i) {
      print(i+"*"+j+"="+i*j+(if (i==j) "\n" else "\t"))
    }

  }

}
