package ch001_basic

fun main(args:Array<String>){
    println("Int min:"+Int.MIN_VALUE+" Int max: "+Int.MAX_VALUE)
    println("Long min:"+Long.MIN_VALUE+" Long max: "+Long.MAX_VALUE)
    println("Float min:"+Float.MIN_VALUE+" Float max: "+Float.MAX_VALUE)
    println("Double min:"+Double.MIN_VALUE+" Double max: "+Double.MAX_VALUE)
    println()
    //문자열
    var str1:String ="Hello"
    var str2:String ="World"
    var str3:String ="Hello"

    println(str1==str2)
    println(str1==str3)
    println()
    // 문자열에 값 할당하기
    var a=1
    var s1="a=$a"
    var s2="a=${a+2}"
    println("s1:$s1, s2:$s2")

}