package ch003_flow_control

fun main() {
    test()
}

fun test(){
    println("함수 시작")
    func(13,3){a,b->
        val result=a+b
        if(result>10)
            return //non local return
        else
            println("result : $result")
    }
    println("함수 끝")
}

inline fun func(a:Int, b:Int, out:(Int,Int)->Unit){
    out(a,b)
}