package ch001_basic

fun main(args:Array<String>){
    val ch:Char='A'
    print(ch+1) //내부적으로는 65+1 // val에다 +1 했으니까 char형태인 B(66)으로 나옴

    //val ch2:Char=65 //숫자를 이용해서 문자는 더이상 만들지 못한다

    val x:Int = 65
    val ch3:Char = x.toChar()
    println(ch3)

}