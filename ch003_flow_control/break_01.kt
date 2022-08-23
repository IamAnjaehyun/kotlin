package ch003_flow_control



fun main() {
    for(i in 1..10){
        print(i)
        if(i==5)
            break
    }
    println()
    println("for 외부")
}