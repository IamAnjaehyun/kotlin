package ch003_flow_control

fun main() {
    val x=1

    when(x){
        1->println("x=1")
        2->println("x=2")
        else->{
            println("x는 1또는 2가 아닙니다.")
        }
    }
}