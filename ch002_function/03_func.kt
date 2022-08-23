package ch002_function

fun main() {
    show("james","clair")

    namedParam(1,2,3)
    namedParam(10)
}

fun show(a:String,b:String):Unit{
    println("$a loves $b")
}

fun namedParam(x:Int, y:Int=50, z:Int=1000){
    println("합: ${x+y+z}")
}

//fun test(a:Int,b:Int,c:Int,d:Int,e:Int)
fun test(vararg arr:Int){
//    print(a+b+c+d+e)
    var sum=0
    for(x in arr){
        sum+=x
    }
}