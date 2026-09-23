fun main(){
    // Exercise 1
    // ?: = Elvis Operator
    print("Enter a number: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 1
    if(num>0){
        println("Your Number ${num} is positive")
    }else if (num<0){
        println("You number ${num}  is negative")
    }else{
        println("Result ${num} = Zero")
    }

    if(num%2==0){
        println("Number: even")
    }else {
        println("Number: odd")
    }


    // Exercise 2
    print("Enter a number(1..7): ")
    val dayNum = readlnOrNull()?.toIntOrNull() ?: 0
    val dayName = when(dayNum){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else -> "Invalid Input"
    }
    println("Day: $dayName")
    println("Number 1..10 and show Square")
    for(i in 1..10){
        val square = i*i
        println("Number $i and Sqaure = ${square.toFloat()}")
    }

    // Exercise3
    print("Enter Score(0..100): ")
    val score = readlnOrNull()?.toDoubleOrNull() ?: 0.0;

    //validation
    if(score<0 || score>100){
        println("Invalid Score")
        return
    }

    val (grade, isPass) = when (score) {
        in 90.0..100.0 -> "A" to true
        in 80.0 .. 89.0 -> "B" to true
        in 70.0 .. 79.0 -> "C" to true
        in 60.0 .. 69.0 -> "D" to true
        in 50.0 .. 59.0-> "E" to true
        else -> "F" to false
    }
    print("Grade: $grade | isPass: ${if(isPass) "Pass" else "Failed"}")

    if(!isPass){
        println()
//        for (i in 1..3){
//            println("Keep practicing")
//        }
        repeat(3){
            println("Keep practicing")
        }
    }
}