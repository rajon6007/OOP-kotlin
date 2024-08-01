package Inheritance

class Teacher(name:String,age:Int,gender:String,var subject:String,var classHour:Int):person(name,age,gender) {

    fun display(){
        println("Teacher name: $name")
        println("Teacher age: $age")
        println("Teacher gender: $gender")
        println("Subject: $subject")
        println("Classhour: $classHour")

    }

}