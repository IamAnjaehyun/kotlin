//package ch004_class
//
//class Patient(val name:String){
//    fun doctorList(d:Doctor){
//        println("환자: $name, 의사: ${d.name}")
//    }
//}
//
//class Doctor(val name:String){
//    fun patinetList(p:Patient){
//        println("환자: ${p.name}, 의사: ${name}")
//    }
//}
//
//fun main() {
//    val doctor=Doctor("슈바이처")
//    val patient=Patient("길동이")
//
//    patient.doctorList(doctor)
//    doctor.patinetList(patient)
//}