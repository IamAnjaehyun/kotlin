package ch001_basic

fun main(args:Array<String>){
    var str1:String="Hello, Kotlin"
    //str1=null
    println("str1 : $str1")

    var str2:String? ="Hello, World"
    str2 = null
    println("str2 : $str2")

    ////////////////
    var str3:String? = "This is Kotlin"
    //str3=null
    println("str3 : $str3, length : ${str3?.length}") // safe call -> 값이 null이면 length쪽으로 가지 않음
    println("str3 : $str3, length : ${str3!!.length}") // null 체크 무시해라..

    /////////////////
    //val len=str3?.length
    val len=if(str3 != null) str3.length else -1
    println("str3 length : ${len}")
}