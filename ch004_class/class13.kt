package ch004_class

private class PrivateClass {
    private var i=1
    private fun privateFunc(){
        i+=1
    }
    fun access(){
        privateFunc()
    }
}

class OtherClass{
    private val obj=PrivateClass()
    fun test(){
        val pc=PrivateClass()
    }
}

fun main(){
    val pc=PrivateClass()
    //pc.i
    //pc.privateFunc()
    test()
}

fun test(){
    val temp=PrivateClass()
}