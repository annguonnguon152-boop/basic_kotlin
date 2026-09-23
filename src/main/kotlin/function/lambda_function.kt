package function

// basic lambda fun
val sum4 = {a: Int, b: Int -> a+b }
val subtract = {x: Double, y: Int -> x-y }
val greet = {name: String -> "Hello, $name"}

// specific type
var multiply: (Double, Int) -> Int = {a, b -> (a * b).toInt()}

val double = {x: Double -> x * 2}
val doubleWithIt: (Int) -> Int = {it*2}
val numbers = listOf(1,2,3,4,5)
//map
val newList = numbers.map({it * 2})

// filter
val evens = numbers.filter({it % 2 == 0})
val odds = numbers.filterNot {it % 2 == 0}


fun main(){
    println(sum4(1,3))
    println(greet("teadin"))
    println(subtract(1.2, 9))
    println(multiply(10.10, 10))
    println(doubleWithIt(10))
    println("Old List: $numbers")
    println("New List: $newList")
    val newValue = newList.forEach { println(it)}
    println(evens)
    println(odds)

}