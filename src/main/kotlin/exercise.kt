import com.sun.tools.javac.Main

fun main(){
    // Exercise 1
//    print("Enter a Number: ")
//    val num = readlnOrNull()?.toIntOrNull() ?: 0
//    // positive, negative, zero
//    if(num >0) {
//        println("Result: Positive")
//
//    }else if (num<0){
//        println("Result: Negative")
//    }else{
//        println("Result: Zero")
//    }
//
//    // Even / Odd
//    if(num %2 ==0) {
//        println("Answer: Is Even")
//    }else{
//        println("Answer: Is Odd")
//    }
    // Exercise 2
//    print("Enter a day number (1..7): ")
//    val numDay = readln().toInt()
//
//    val dayName = when(numDay){
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day"
//
//    }
//    println("Day: $dayName")
//
//    println("\n1..10 and their Squares")
//    for(i in 1..10){
//        val squares = i*i
//        println("Number: $i -> Squares: $squares")
//    }


    // Exercise3
//    print("Enter score (0..100): ")
//    val score = readln().toInt()
//
//    if (score !in 0..100) {
//        println("Invalid score! Please enter a number between 0 and 100.")
//        return
//    }
//
//    val (grade, isPass) = when (score) {
//        in 90..100 -> "A" to true
//        in 80..89 -> "B" to true
//        in 70..79 -> "C" to true
//        in 60..69 -> "D" to true
//        in 50..59 -> "E" to true
//        else -> "F" to false
//    }
//
//    println("Grade: $grade")
//    println("Status: ${if (isPass) "Pass" else "Fail"}")
//    if (!isPass) {
//        println()
//        repeat(3) {
//            println("Keep practicing")
//        }
//    }
}