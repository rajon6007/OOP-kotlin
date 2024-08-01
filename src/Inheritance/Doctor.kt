package Inheritance

class Doctor(name:String,age:Int,gender:String,var department:String,var fee:Int):person(name,age,gender) {

    fun display(){
        println("Doctor name: $name")
        println("Doctor age: $age")
        println("Doctor gender: $gender")
        println("Doctor department: $department")
        println("Doctor fee: $fee")

    }
}