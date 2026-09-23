package function
// non return function
//fun greet1(){
//    println("Welcome to my App ")
//}
//// call another func into another func
//fun greet(){
//    println("Welcome to my App ")
//    introduction("Ann", "odasda", "fdjasfj")
//}
//
//fun introduction(vararg names: String) {
//
//    // 1. for loop
//    // យក element ម្តងមួយពី names
//    for (name in names) {
//        println("Name: $name")
//    }
//
//    // 2. forEach with implicit parameter: it
//    // it តំណាងឱ្យ element បច្ចុប្បន្ន
//    names.forEach {
//        println("Name: $it")
//    }
//
//    // 3. forEach with explicit parameter
//    // យើងដាក់ឈ្មោះ parameter ដោយខ្លួនឯងថា name
//    names.forEach { name ->
//        println("Name: $name")
//    }
//
//    // 4. Iterator
//    // បង្កើត Iterator ដើម្បីដើរតាម element ម្តងមួយ
//    val iterator = names.iterator()
//
//    // hasNext() ពិនិត្យថា នៅមាន element បន្ទាប់ទៀតឬអត់
//    while (iterator.hasNext()) {
//
//        // next() យក element បន្ទាប់
//        val name = iterator.next()
//
//        println("Name: $name")
//    }
//}
//// non return function
///*joinToString() គឺជា Function មួយក្នុង Kotlin
// ដែលប្រើសម្រាប់ យក element ច្រើនៗក្នុង Array / List / Collection មកភ្ជាប់ជាមួយគ្នា ហើយបង្កើតជា String មួយ។
// */
//
//fun age(vararg age: Int){
//    println("Age: ${age.joinToString(",")}")
//}
//
//// return function
//fun sum(vararg number: Int): Int{
//    var total = 0;
//    for (num in number){
//        total += num
//    }
//
//    return total
//}
///*
//vararg ក្នុង Kotlin មានន័យថា Variable Number of Arguments។
//វាអនុញ្ញាតឲ្យ Function មួយទទួល Argument ច្រើន ដោយមិនចាំបាច់កំណត់ចំនួនជាមុន។
// */
fun ouput(){
//    println("Result: ${sum(5, 10, 15, 20, 30)}")
    println("Net Salary: ${calPrice()}")
    println("Net salary: ${calPrice(rate = 0.3)}")
    println("Net salary: ${calPrice(300.0, hour= 10)}")
}
fun greet2(name: String = "Franco", age: Int = 20){
    println("Name: $name and age: $age")
}

fun calPrice(salary: Double=250.0, rate: Double = 0.2, hour: Int = 5): Double{
    return salary + hour * rate
}

fun animal(name: String, age: Int, sound: String){
    println("Animal is $name and age is $age and sound is $sound")
}

fun displayUser(email: String, name: String, password: String) {
    println("Email: ${email.lowercase()} \nName: $name \npassword: $password")
}
// អនុគមន៍ប្រភេទ Unit (បញ្ជាក់ច្បាស់)
fun printMessage(message: String): Unit {
    println(message)
}

// អនុគមន៍ Unit ដោយមិនបញ្ជាក់ (Unit ត្រូវបានលុប)
fun logInfo(info: String) {
    println("[INFO] $info")
}

// Unit ក៏អាចប្រើជា expression បានដែរ
fun showDialog(title: String) {
    println("Showing dialog: $title")

    // អាចសរសេរឬមិនសរសេរក៏បាន
}

fun main(){
//    greet2()
//    greet2("nana", 21)
//    ouput();
//    animal(age = 1, name = "cute", sound = "meow meow")
//    displayUser("franco@gmail.com",  password = "12344", name= "Franco")
    printMessage("Hello, World!")
    logInfo("Application started")
    showDialog("Welcome")

//    greet()
//    age(5)
//    ouput();
}