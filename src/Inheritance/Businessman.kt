package Inheritance

class Businessman(name:String,age:Int,gender:String,var annualIncome:Double):person(name,age,gender) {

    fun display(){
        println("Businessman name: $name")
        println("Businessman age: $age")
        println("Businessman gender: $gender")
        println("AnnualIncome: $annualIncome")

    }






}