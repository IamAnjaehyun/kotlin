package ch003_flow_control

fun main() {
    val a=10
    val b=10
    var c:Int

    try{
        c=a/b
    }
    catch (e:Exception){
        println("예외 발생")
    }
    finally {
        println("항상 실행됨")
    }

}