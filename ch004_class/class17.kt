package ch004_class

// 집합관계 - 포함하고있다.

class Pond(_name:String, _members:MutableList<Duck>){
    val name=_name
    val members:MutableList<Duck> = _members

    constructor(_name:String):this(_name, mutableListOf<Duck>())
}

class Duck(val name:String)

fun main(){
    val pond=Pond("보정연못")
    val d1=Duck("오리1")
    val d2=Duck("오리2")

    pond.members.add(d1)
    pond.members.add(d2)

    for(duck in pond.members){
        println(duck.name)
    }
}