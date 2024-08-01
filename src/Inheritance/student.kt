package Inheritance

class student(name:String,age:Int,gender:String,var studentId:Int):person(name,age,gender) {

    fun display(){
        println("Student name: $name")
        println("Student age: $age")
        println("Student gender: $gender")
        println("Student Id: $studentId")

    }
}