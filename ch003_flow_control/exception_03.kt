package ch003_flow_control


//사용자정의 exception

class UserException(msg:String) : Exception(msg)

fun main() {
    var name="clair1234" //숫자가 포함된 이름

    try{
        checkName(name)
    }
    catch(e:UserException){ //숫자가 포함되어있으면, 여기로 온다
        print(e.message)
    }
    catch(e:Exception){ //위에서 안 걸린 에외를 여기서 처리
        print(e.message)
    }
}

fun checkName(name:String){
    if(name.matches(Regex(".*\\d+.*"))){ //이름에 숫자가 있댜ㅏ.
        throw UserException("이름 $name, (이름에 숫자가 있다, 안된다.)")
    }
}