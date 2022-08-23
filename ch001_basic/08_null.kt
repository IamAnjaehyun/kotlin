package ch001_basic

fun main() {
    val a:Int=128
    val b=128
    println(a==b)
    println(a===b) // 실제 메모리값 비교하는 연산자


    val c:Int?=128
    val d:Int?=128
    println(a==c) // 변수의 값만 비교
    println(a===c) // 메모리값을 비교

}