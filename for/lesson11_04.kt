//forのネスト（同じ種類のものが中に入っている）
fun main(){
  for(i in 0..2){
    //上のループが回るたび、中のループは０〜２を表示する
    for (j in 0..2) {
      println("${i}-${j}")
    }
  }
}