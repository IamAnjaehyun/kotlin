package ch004_class

open class Car constructor(_year:Int, _model:String, _power:String, _wheel:String) {
    private var year:Int=_year //연식
    public var model:String=_model //모델명
    protected open var power=_power
    internal var wheel:String=_wheel

    protected fun start(key:Boolean){
        if(key){
            println("시동을 켭니다.")
        }
    }

    class Driver(_name:String, _license:String) {
        private var name: String = _name
        var license: String = _license
        internal fun driving() {
            println("[운전자] $name 이 운전합니다.")
        }
        public fun getName():String=name
    }
}

class Sonata(_year: Int,_model: String,_power: String,_wheel: String, var name:String, var key: Boolean):Car(_year,_model,_power,_wheel){
    override var power: String="120hp"
    var driver=Driver(name, "1급운전자 면허")

    constructor(_name:String,_key:Boolean):this(2021,"Basic","100hp","normal",_name, _key){
        name=_name
        key=_key
    }

    fun access(password:String){
        if(password=="123456"){
            println("*** 쏘나타 ***")
            println("모델명: ${super.model}")
            //println("파워: ${super.power}")
            println("파워: ${power}")
            println("휠: $wheel")
            //운전자 이름, 운전면허등급
            println("이름: ${driver.getName()}")
            println("운전면허등급: ${driver.license}")
        }
        else{
            println("--- 도둑입니다 ---")
        }
    }
}

class Burglar{
    fun steal(anycar:Any){
        if(anycar is Sonata){
            println("[도둑놈] 쏘나타를 훔칩니다.")
            println("차이름: ${anycar.name}")
            println("차모델: ${anycar.model}")

            //연식정보
            //println("차 연식: ${anycar.year}")
            //println("파워 : ${anycar.power}")

            //운전자정보
            println("면허 정보: ${anycar.driver.license}")

            //anycar.driver.driving()
            anycar.access("Idontknow")
        }
        else{
            println("차를 훔칠 수 없습니다.")
        }
    }
}

fun main() {
    var myCar=Sonata("Jaehyun", true)
    myCar.access("123456")

    var burglar=Burglar()
    burglar.steal(myCar)
}