package ch004_class

class AirPlane(val name:String, val power:String) {
    private var engine=Engine()

    fun startEngine(){
        engine.start(name)
    }

    fun stopEngine(){
        engine.stop(name)
    }

}

class Engine{
    fun start(name:String)=println("$name 엔진이 작동합니다.")
    fun stop(name:String)=println("$name 엔진이 꺼집니다.")
}

fun main(){
    var airplane=AirPlane("에어버스","1000")
    airplane.startEngine() // 보잉 엔진이 작동합니다.
    airplane.stopEngine()  // 보잉 엔진이 꺼집니다.
}