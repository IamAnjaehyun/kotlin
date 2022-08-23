package ch003_flow_control

fun main() {
    test1()
}

/*fun test1(){
    println("함수 시작")
    func1(13,3) aaa@{a,b->
        val result=a+b
        if(result>10)
            return@aaa //non local return
        else
            println("result : $result")
    }
    println("함수 끝")
}*/

fun test1(){
    println("함수 시작")
    func1(13,3) {a,b->
        val result=a+b
        if(result>10)
            return@func1 //non local return
        else
            println("result : $result")
    }
    println("함수 끝")
}

inline fun func1(a:Int, b:Int, out:(Int,Int)->Unit){
    out(a,b)
}