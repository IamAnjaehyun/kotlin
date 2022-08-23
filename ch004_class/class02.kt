//package ch004_class
//
////부생성자를 사용하는 class
//class Bird{
//    //프로퍼티
//    var name:String
//    var wing:Int
//    var beak:String
//    var color:String
//
//    //부생성사 secondary 생성자
//    constructor(name:String, wing:Int, beak:String, color:String){
//        this.name=name
//        this.wing=wing
//        this.beak=beak
//        this.color=color
//    }
//    constructor(name:String,beak:String){
//        this.wing=2
//        this.color="white"
//        this.name="name"
//        this.beak="beak"
//    }
//
//    fun fly()=println("Fly wing: $wing")
//    fun sing(vol:Int)=println("Sing volume: $vol")
//}
//
//fun main() {
//    val eagle=Bird("독수리",2,"Long","Black")
//    eagle.fly()
//    eagle.sing(7)
//
//    val carw=Bird("까마귀","Long")
//    eagle.fly()
//    eagle.sing(7)
//}