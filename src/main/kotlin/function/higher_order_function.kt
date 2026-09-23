package function
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    return operation(a , b)
}

// ex a = 2 , b = 3
// operation(x,y) =  x + y


fun main(){
    println("Operate = ${operate(2,3,{x, y -> x + y})}")
}