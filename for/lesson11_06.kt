//forのネスト（同じ種類のものが中に入っている）
fun main(){
  val arr = arrayListOf(2, 4, 6, 8, 10)
  var sum = 0

  for(i in arr){
      sum += i
    }
  println(sum)
  }