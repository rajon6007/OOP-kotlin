package Function

fun main(){

    sum(50, 60)


}
fun sum(a:Int,b:String,c:Double){
    println(b+a+c)

}
fun sum(a:Double,b:Float,c:String){
    println(c+b+a)
}
fun sum(x:Int,b:Int):Int{
    return x+b
}