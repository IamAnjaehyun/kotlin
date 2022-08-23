package ch002_function

fun main() {
    shortFunc(3,{println("첫번째 호출: $it")})
    shortFunc(3,{println("두번째 호출: $it")})
}

inline fun shortFunc(a:Int, out:(Int)->Unit){
    println("before calling out()")
    out(a)
    println("after calling out()\n")
}