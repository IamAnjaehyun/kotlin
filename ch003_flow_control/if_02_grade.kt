package ch003_flow_control

fun main() {
    print("성적 : ")
    val score=readLine()!!.toDouble()


    // 90이상이면 A
    // 70이상 ~ 90미만 B
    // 나머지 F

    val grade=if(score>=90) 'A'
                else if(score>=70 && score<90) 'B'
                else 'F'

    println("학점 : $grade")
}