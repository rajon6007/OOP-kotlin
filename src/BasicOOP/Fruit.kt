package BasicOOP

class Fruit{
    var name:String =""
    var colour:String =""
    var size: Int =0

    constructor(name:String)

    constructor(name: String,colour:String){

        this.name =name
        this.colour = colour

    }

    constructor(name: String,colour:String,size:Int){
        println("Name:  $name, Colour: $colour, Size: $size")

    }

}