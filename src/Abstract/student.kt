package Abstract

class student:person() {
    override var name: String=""
    override var age:Int=0
    override var gender:String=""

    override fun work() {
        println("I am a Student")
    }

}