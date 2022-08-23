package ch003_flow_control

fun main() {
    print("성적 : ")
    val score=readLine()!!.toDouble()


    // 90이상이면 A
    // 70이상 ~ 90미만 B
    // 나머지 F
    var grade:Char='F'
//    when(score){
//        in 90.0..100.0->grade='A'
//        in 70.0..89.99->grade='B'
//        else->grade='F'
//    }

    when{
        score>=90.0 -> grade='A'
        score in 70.0..89.99->grade = 'B'
        score<70->grade = 'F'
    }

    println("학점 : $grade")
}