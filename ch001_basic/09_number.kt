package ch001_basic

fun main() {
    var test:Number=20
    test=3.14 //자동 형변환
    println("$test")

    test=13
    if(test is Int)
        println("Int 타입: $test")

    test=13L
    println("$test")

    test=13.57
    println("$test")
}