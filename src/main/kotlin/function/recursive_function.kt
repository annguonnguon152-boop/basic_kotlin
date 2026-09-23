package function
// recursive function
fun factorial(n: Int): Int{
    return if(n<=1){
        1
    }else{
        n * factorial(n-1)
    }
}
// Example n = 5
// n = 5   5<= 1 (false) -> else 5 * factorial(4) = 5 * 4 * factorial(3)
// n = 4   4<= 1 (false) -> else 4 * factorial(3) = 5 * 4 * 3 * factorial(2)
// n = 3   3<= 1 (false) -> else 3 * factorial(2) =  5 * 4 * 3 * 2 * factorial(1)
// n = 2    2<=1 (false) -> else 2 * factorial(1)
// n = 1    1<=1 (true) = 5 * 4 * 3 * 2 * 1

fun factorial1(n: Int): Int = if(n<=1) 1 else n * factorial1(n-1)




fun fibonacci(n: Int): Int {
    return if(n<=1){
        n
    }else{
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}
// n = 5 => fibonacci(4) + fibonacci(3)
            // fib(3) + fib(2) + fib(3)
            // fib(2) + fib(1) + fib(2) + fib(3)
            // fib(1) + fib(0) + fib(1) + fib(2) + fib(3)
            // 1 + fib(0) + fib(1) + fib(2) + fib(3)
            // 1 + 0 + fib(1) + fib(2) + fib(3)
            // 1 + 1 + fib(2) + fib(3)
            // 2 + fib(1) + fib(0) + fib(3)
            // 2 + 1 + fib(0) + fib(3)
            // 3 + 0 + fib(3)
            // 3+ fib(2) + fib(1)
            // 3 + fib(1) + fib(0) + fib(1)
            // 3 + 1 + fib(0) + fib(1)
            // 4 + 0 + fib(1)
            // 4 + 1 = 5

// n = 4 =>  fibonacci(3) + fibonacci(2)
// n = 3 =>
fun fibonacci2(n: Int): Int = if(n<=n) n else fibonacci2(n - 1) + fibonacci2(n - 2)

fun sumUpTo(n: Int): Int{
    return if(n<=1){
        0
    }else{
        n + sumUpTo(n-1)
    }
}
// n = 10 => 10 + sumUpTo(9)
// n = 9 => 10 + 9 + sumUpTo(8)


fun main(){
    println("Factorial = ${factorial(5)}")
    println("Factorial2 = ${factorial(5)}")
    println("Fib1: ${fibonacci(5)}")
    println("Result: ${sumUpTo(10)}")

}
//    println("SumUpTo = ${sumUpTo(10)}")
//fun sumUpTo(n: Int): Int = if(n<=0) 0 else n + sumUpTo(n-1)