package ch003_flow_control


fun main() {
    var amount=600

    try{
        amount-=100
        checkAmount(amount)
    }
    catch(e:Exception){
        println(e.message)
    }

    println("amount: $amount")
}

fun checkAmount(x:Int){
    if(x<=500){
        throw Exception("잔고가 $x 이고, 500원 이하 입니다.")
    }
}