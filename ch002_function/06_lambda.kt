package ch002_function

fun main() {
    noParam({"Hello World"})
    noParam {"Hello World"}  //소괄호 생략 가능

    //
    OneParam({a->"테스트: $a"})
    OneParam { "테스트: $it" }

    //2개의 람다식을 매개변수로 가진다
    twoLambda({a,b->"First $a,$b"}, {"Second $it"})
}

fun noParam(out:()->String)=println(out())

fun OneParam(out:(String)->String) = println(out("one 파라미터"))

fun twoLambda(first:(String,String)->String, second:(String)->String) {
    println(first("One","Two"))
    println(second("오늘의 마지막 문제"))
}