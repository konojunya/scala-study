object App {

  def main(args: Array[String]): Unit = {
    //整数 Byte Short Int Long
    val i = 5

    // Long
    val l = 55555555L

    //浮動小数点 Float Double
    val d = 3232.5
    val f = 234.34F

    //文字 Char
    val c = 'a' // 文字はsingleクォーテーション  

    //文字列 String
    val s = "Hello" // 文字列はdoubleクォーテーション

    // 論理値 Boolean
    val flag = true // true or false

    // 特殊文字
    /*
    \n 改行
    \t タブ
    */

    val msg = "He\nllo"
    println(msg)
  }

}