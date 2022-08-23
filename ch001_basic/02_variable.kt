package ch001_basic

fun main(args:Array<String>) {
    var x:Int=10 //var형태는 값 변경이 가능하다. (변수)
    println("x= "+x)

    x=20
    println("x= "+x)

    /////////////////////
    val y:Int = 20  //val형태는 값 변경이 불가능하다. (상수)
    println("y= "+y)

    //y=30
    //println("y= "+y)

}