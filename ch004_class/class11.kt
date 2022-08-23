package ch004_class

// outer 클래스 , inner 클래스

open class Base {
    open val x:Int=1
    open fun f()=println("[Base 클래스] f()")
}

class Child:Base(){
    override val x: Int = super.x+1
    override fun f() {
        println("[Child 클래스] f()")
    }

    inner class Inside{
        fun f()=println("[Inside 클래스] f()")

        fun test(){
            f()
            Child().f()
            super@Child.f()
            println("x=$x")
            println("부모x=${super@Child.x}")
        }

    }
}
fun main(){
    var t=Child()
    t.Inside().test()
}