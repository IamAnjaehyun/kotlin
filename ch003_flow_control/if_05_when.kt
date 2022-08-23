package ch003_flow_control

fun main() {
    cases("hello")
    cases(1)
    cases(System.currentTimeMillis())

}

fun cases(obj:Any){
    when(obj){
        1->println("Int: $obj")
        "hello"->println("String: $obj")
        !is String->println("Not a String: $obj")
        else->println("Unknown")
    }

}