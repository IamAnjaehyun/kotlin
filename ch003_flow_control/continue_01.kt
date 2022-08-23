package ch003_flow_control

fun main() {
    println("시작")

    first@for(i in 1..5){
        for(j in 1..5){
            if(j==3)
                continue@first
            println("i=$i, j=$j")
        }
        println("end of j")
    }
    println("끝")
}