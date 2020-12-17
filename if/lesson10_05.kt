//if(条件){
//   条件を満たした時の処理;
// } else if(条件B){
//   条件Bを満たした時の処理
// } else {
//   条件を満たさない時の処理
// }

fun main() {
  val age = 19;

  if (age >=20){
    println("adult");
  } else if (age == 0){
    println("baby");
  } else {
    println("child");
  }
}