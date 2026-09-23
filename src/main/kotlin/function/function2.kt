package function
fun display(){
    println("Add= ${add(1,2)}")
    println("Sum= ${sum(1,2)}")
    println("Mulitply = ${multiply(1,2.2)}")
    println("Min= ${min(3,2.0)}")
    println("Min2= ${min2(3, 2)}")
    println("Is Even= ${isEven(2)}")

//    println("isEven ${isEven(7)}")
    println("Traffic Action: ${getTrafficAction("RED")}")
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun sum(a:Int, b:Int): Int= a+b

fun multiply(a:Int, b: Double) = a*b

fun min(a:Int, b:Double) = if(a<b) a else b

fun min2(a:Int, b: Int): Int {
    if(a<b) return a
    else return b
}

fun min3(a:Int, b:Int)= if(a<b) a else b
// equality operator
fun isEven(number: Int) = number % 2 == 0

fun isFound(found: Boolean){
    if(found){
        println("Data has founded")
    }else{
        println("Data not found")
    }
}

fun isOdd2(number: Int): Boolean{
    if(number % 2 == 0) return true
    else return false
}
// Camel case
fun getTrafficAction(color: String) = when(color.lowercase()){
    "red" -> "Please Stop"
    "green" -> "Go Forward/turn"
    "yellow" -> "Speed up"
    else -> "Unknown Colour"
}

fun main(){
    display()
    isFound(found = true)
}

