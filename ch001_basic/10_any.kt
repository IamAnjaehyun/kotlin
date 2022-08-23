package ch001_basic

fun main() {
    checkArg("Hello") //문자열이 함수의 인자로 들어감
    checkArg(77)
}

fun checkArg(x:Any){
    if(x is String)
        println("x is String: $x")
    if(x is Int)
        println("x is Int: $x")
}