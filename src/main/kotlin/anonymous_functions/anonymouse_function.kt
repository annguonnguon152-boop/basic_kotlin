package anonymous_functions
/*
Anonymous Function ត្រូវ បាន សរសេរ
ដោយ ប្រើ ពាក្យ គន្លឹះ fun ដោយ គ្រាន់តែ មិន បញ្ជាក់ ឈ្មោះ អនុគមន៍ ប៉ុណ្ណោះ៖
 */
val add = fun(a: Int, b: Int): Int{
    return a + b;
}

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
val newList = numbers.map(fun (x): Int {return x * 2})
val evens = numbers.filter(fun(x): Boolean {
    return x % 2 == 0
})

fun main(){
    println(add(100, 200))
    println(newList)
    println(evens)
}
