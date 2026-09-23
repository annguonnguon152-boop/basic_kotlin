package inline_function
// basic
inline fun doTask(action: ()-> Unit){
    action()
}

fun repeat(times: Int, action: (Int)->Unit){
    for(i in 0 until times){
        action(i)
    }
}
//fun <T> List<T>.normalForEach(action: (T) -> Unit) {
//    for(item in this) {
//        action(item)
//    }
//}

fun main(){
    doTask({
        println("Hello")})

    repeat(5, {i -> println("$i ")})

}

//    val list = (1..100).toList()
//    list.normalForEach {
//        println(it)
//    }
//    list.forEach { println(it) }
