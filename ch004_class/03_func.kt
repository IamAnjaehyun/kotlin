package ch004_class

fun main() {
    show("james","clair")
    namedParam(1,2,3)
    namedParam(10)
    namedParam(z=99)

    test(1,2,3,4,5)
}

fun show(a:String,b:String):Unit{
    println("$a loves $b!!")
}

fun namedParam(x:Int=0,y:Int=50,z:Int=1000){
    println("합: ${x+y+z}")
}

//fun test(a:Int,b:Int,c:Int,d:Int,e:Int){}

fun test(vararg arr:Int){
    //print(a+b+c+d+e)
    var sum=0
    for(x in arr){
        sum+=x
    }
    println("가변인자 합: ${sum}")
}