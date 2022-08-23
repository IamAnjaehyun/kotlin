package ch004_class

open class Person(name:String,
                  out:Unit=println("[주생성자]")){
    val x=println("[프로퍼티] - $name")

    //초기화 블록
    init{
        print("[초기화블록]")
    }

    //부생성자
    constructor(name:String, age:Int, out:Unit=println("[부생성자] out")):this(name){
        println("[부생성자 함수내용]")
    }
}

fun main() {
    val p1=Person("제임스",21)
    println("--------------")
    val p2=Person("철수")
}