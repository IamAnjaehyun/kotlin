package ch004_class

class Calc{
    fun add(x:Int,y:Int):Int=x+y
    fun add(x:Double,y:Double):Double=x+y
    fun add(x:Int,y:Int,z:Int):Int=x+y+z
    fun add(x:String,y:String):String=x+y
}

fun main() {
    val calc=Calc()
    println(calc.add(2,8))
    println(calc.add(3.14,1.414))
    println(calc.add(2,8,10))
    println(calc.add("Hello","Kotlin"))
}
