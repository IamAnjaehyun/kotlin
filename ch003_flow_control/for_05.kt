package ch003_flow_control

//1~100 까지 홀수의 합
//1~100 까지 짝수의 합

fun main() {
    var sum1=0 //홀
    var sum2=0 //짝
    for(x in 1..100 step 2){
       sum1+=x
    }
    println("$sum1")
    for(x in 0..100 step 2){
        sum2+=x
    }
    println("$sum2")
}