//package ch004_class
//
////초기화 블록
////생성자 : 초기화
//
//class Bird(var name:String="이름없는 새",var wing:Int=2,var beak:String,var color:String){ //프로퍼티를 주 생성자에 선언
//    //초기화 블록
//    init{
//        println("+++Bird 클래스 초기화 블록")
//        println("이름: $name, 색상: $color")
//        println("+++Bird 클래스 초기화 블록 끝")
//    }
//
//    //메서드
//    fun fly()=println("Fly wing: $wing")
//    fun sing(vol:Int)=println("Sing volume: $vol")
//}
//
//fun main() {
//    val mybird=Bird("my Bird",2,"normal","rainbow")
//    val mybird2=Bird(beak="normal",color="rainbow")
//    mybird.fly()
//}