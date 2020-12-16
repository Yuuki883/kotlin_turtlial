//上から順に扱える桁数が小さい

fun main() {
  var var01:Byte = 1;
  var var02:Short = 12345;
  var var03:Int = 1234567890;
  var var04:Long = 123456789000;
  //エラー
  // var var04:Int = 123456789000;

  println(var01)
  println(var02)
  println(var03)
  println(var04)
}