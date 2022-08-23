package ch003_flow_control

fun main() {
    val a=10
    val b=20

    var max=if(a>b) {
        a
    }
    else{
        b
    }

    print("최대: $max")
}