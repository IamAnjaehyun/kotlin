//package ch004_class
//
//open class Person{
//    constructor(name:String){
//        println("[person] 이름 : $name")
//    }
//
//    constructor(name:String, age:Int){
//        println("[person] 이름 : $name, 나이: $age")
//    }
//
//}
//
//class Developer:Person{
//    constructor(name:String):this(name, 21){
//        println("[Developer] 이름 : $name")
//    }
//
//    constructor(name:String,age:Int):super(name,age){
//        println("[Developer] 이름 : $name, 나이: $age")
//    }
//}
//
//fun main() {
//    val james=Developer("제임스")
//}