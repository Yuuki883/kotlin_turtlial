//型推論を見るためにデータの指定なし
fun main() {
  var var01 = 1;
  var var02 = 12345;
  var var03 = 1234567890;
  var var04 = 123456789000;

  println(var01.javaClass.kotlin)
  println(var02.javaClass.kotlin)
  println(var03.javaClass.kotlin)
  println(var04.javaClass.kotlin)
}