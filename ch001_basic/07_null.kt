package ch001_basic

fun main(args:Array<String>){
    var str1:String? ="Hello, Kotlin"
    str1=null
    println("length: ${str1?.length ?:-1}")
    //           ?.==   safe call   ?: == 엘비스 연산자(null이면 -1)

}