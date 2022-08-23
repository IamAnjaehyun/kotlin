package ch004_class


//인터페이스

open class A{
    open fun f()=println("[A클래스] f()")
    fun a()=println("[A클래스] a()")
}

interface B{
    fun f()=println("[B클래스] f()")
    fun b()=println("[B클래스] a()")
}

class C:A(), B{
    override fun f()=println("[C클래스] f()")

    fun test(){
        f()
        b()
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c=C()
    c.test()
}