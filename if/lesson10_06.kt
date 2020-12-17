//if(条件){
//   条件を満たした時の処理;
// } else if(条件B){
//   条件Bを満たした時の処理
// } else {
//   条件を満たさない時の処理
// }

fun main() {
  val age = 10;

  if (age >= 10 && age < 20){
    println("10代");
  } else if (age >= 20 && age < 30){
    println("20代");
  } else if(age >= 30 && age < 40){
    println("30代");
  } else {
    println("それ以外")
  }
}