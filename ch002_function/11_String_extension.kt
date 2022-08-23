package ch002_function

fun main() {
    val s="Hello world"
    val t="Kotlin, Kotlin, Kotlin"
    println(s.getLongString(t))
}

//String의 확장함수 작성

fun String.getLongString(x:String):String{
    return if(this.length>x.length) this else x
}