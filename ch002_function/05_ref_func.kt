package ch002_function

fun main() {
    val res1=funcParam(3,2,::sum3)
    println(res1)

    hello(::text)
}

fun sum3(a:Int,b:Int) = a+b
fun funcParam(a:Int, b:Int, c:(Int,Int)-> Int):Int = c(a,b)

fun text(a:String,b:String)="Hello! $a $b"
fun hello(f:(String,String)->String):Unit=println(f("An","Jaehyun"))