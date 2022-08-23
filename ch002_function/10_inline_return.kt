package ch002_function

fun main() {
    shortFunc2(3){
        println("첫번째 호출: $it")
        //return
    }
}

inline fun shortFunc2(a:Int,crossinline out:(Int)->Unit){
    println("before calling out()")
    out(a)
    println("after calling out()\n")
}