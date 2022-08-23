package ch003_flow_control
//팩토리얼 계산
fun main() {
    print("Enter the number : ")
    val n=readLine()!!.toInt()

    var result:Long=1
    var i:Int=1
    while(i<n){
        result*=i
        i++
    }
    println(result)
}