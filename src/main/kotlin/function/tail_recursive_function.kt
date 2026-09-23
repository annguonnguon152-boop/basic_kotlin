package function
// Accumulate ប្រែថា "សន្សំ" ឬ "បូក/គុណសរុបបញ្ចូលគ្នា

tailrec fun factorialTail(n: Int, accumulator: Int = 1): Int {
    return if (n <= 1) {
        accumulator
    } else {
        factorialTail(n - 1, n * accumulator)
    }
}
// n = 5 => else factorial(4, 5)
// n = 4 => else factorial(3, 20)
// n = 3 => else factorial(2, 60)
// n = 2 => else factorial(1, 120)
// n = 1 => 120

fun main(){
    print("Factorial Tail= ${factorialTail(5)}")
}