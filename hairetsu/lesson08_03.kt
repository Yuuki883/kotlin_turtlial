//多次元配列
//二次元配列
fun main(){
  val a1 = arrayListOf("sato", "suzuki");
  val a2 = arrayListOf("takahashi", "tanaka");
  val parent_arr = arrayListOf(a1, a2);

  //一つ目の配列なので[0]
  println(parent_arr[0][0])
  println(parent_arr[0][1])
  //二つ目の配列なので[1]
  println(parent_arr[1][0])
  println(parent_arr[1][1])
}