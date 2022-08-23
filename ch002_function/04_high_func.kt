package ch002_function

fun main() {
    //일반함수
    val res1=total(3,2)
    val res2=multi(sum(2,3),5)
    println("res1: $res1, res2: $res2")

    //반환값에 일반함수 사용하기
    println("반환값에 일반함수: ${testfunc()}")

    //변수에 람다식을 할당하기
    var result:Int
    var times={x:Int, y:Int -> x*y}

    result=times(10,20)
    println("변수에 람다식 ${result}")

    val mutli2:(Int,Int)-> Int = {
        x:Int,y:Int->
        x*y // 마지막 표현식이 반환된다.
    }

    //고차함수 사용 - 람다식을 매개변수와 인자식으로 사용한다
    var res3:Int
    res3=highOrderFunc({x,y->x+y},10,20)
    println("고차함수 람다식 : $res3")
    println(res3 is Int)
}

fun total(a:Int,b:Int)=a+b
fun multi(a:Int,b:Int)=a*b

fun testfunc():Int{
    return sum(7,9)
}

fun highOrderFunc(add:(Int,Int)->Int, a:Int,b:Int):Int{
    return add(a,b)
}
