
//fun関数名(引数) {
// 実行する処理
// }

fun main (){
  val result = cal(9, 4, 2)
  println(result)
}

//引数名、型指定
fun cal(a: Int, b: Int, c: Int): Int{
  return (a + b + c) / 3
}