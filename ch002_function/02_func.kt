package ch002_function

fun main() {
    //숫자 2개
    val a=98
    val b=10
    // 최대값을 구하는 함수 max(a,b)
    val res=max(a,b)
    println("max= $res")
}

//fun max(a:Int,b:Int){
//    if(a>b) return a
//    else return b
//}

fun max(a:Int,b:Int) = if(a>b) a else b