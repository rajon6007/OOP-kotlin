package Practice

class Teacher {
    var name: String = ""
    var id: Int = 0
    var address: String = ""

    constructor()

    constructor(name: String) {
        this.name = name
    }


    constructor(name: String, id: Int) {
        this.name = name
        this.id = id
    }

    constructor(name: String, id: Int, address: String) {
        this.name = name
        this.id = id
        this.address = address
    }

    fun display(){
    println("Teacher-name: $name,Id: $id,Address: $address")
    }
}


class student {
    var name: String = ""
    var id: Int = 0
    var address: String = ""

    constructor()

    constructor(name: String) {
        this.name = name
    }


    constructor(name: String, id: Int) {
        this.name = name
        this.id = id
    }

    constructor(name: String, id: Int, address: String) {
        this.name = name
        this.id = id
        this.address = address
    }

    fun display() {
        println("Student-name: $name,Id: $id,Address: $address")
    }


}