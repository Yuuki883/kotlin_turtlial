
fun main(){
  for (i in 1..10) {
    if (i == 3){
      continue
    }
    else if (i == 7){
      break
    }else{
      println(i)
    }
  }
}