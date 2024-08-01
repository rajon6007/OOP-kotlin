package oop

class Vehicle(
    var model: String,
    var brand: String,
    var engine: Int,
    var seat: Int,
    var madeIn: String) {

    init {
        println("Model: $model,Brand: $brand,Engine: $engine,Seat: $seat,MadeIn: $madeIn")
    }

    fun horn() {
        println("Sound is pip pip pip")


    }


}