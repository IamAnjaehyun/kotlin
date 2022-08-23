package ch004_class

open class Bird(var name:String,var wing:Int, var beak:String, var color:String){
    fun fly()=println("Fly wing: $wing")
    open fun sing(vol:Int)=println("Sing vol: $vol")
}

class Parrot(name:String,
             wing:Int,
             beak:String,
             color: String,
             var language:String="korean"):Bird(name, wing, beak, color){

    fun speak()= println("$language 로 이야기한다.")
    override fun sing(vol:Int) {
        println("나는 앵무새, 볼륨 $vol 이다.")
        speak()
        super.sing(8)
    }
}


fun main(){

    val parrot=Parrot("my parrot",2,"long","red","한국어")

    println()
    parrot.sing(9)

}