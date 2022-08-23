package ch004_class
//의존관계 환자가 만들어져야 의사가 만들어짐
class Patient(val name:String, var id:Int){
    fun doctorList(d:Doctor){
        println("환자: $name, 의사: ${d.name}")
    }
}

class Doctor(val name:String, val p:Patient){
    val customerId=p.id
    fun patinetList(p:Patient){
        println("환자: ${p.name}, 의사: ${name}")
        println("환자 ID: ${customerId}")
    }
}

fun main() {

    val patient=Patient("길동이",2021)
    val doctor=Doctor("슈바이처",patient)

    patient.doctorList(doctor)
    doctor.patinetList(patient)
}