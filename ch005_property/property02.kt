package ch005_property

class User(var _id:Int,var _name:String, var _age:Int){
    val id:Int=_id
    get()=field

    var name:String=_name
    get()=field
    set(value){
        field=value
    }

    var age:Int=_age
        get()=field
        set(value){
            field=value
            println("나이 setter")
        }
}

fun main(){
    val user=User(2021,"James",21)
    var name=user.name
    user.age=31

    println("이름: $name, 나이: ${user.age}")
}