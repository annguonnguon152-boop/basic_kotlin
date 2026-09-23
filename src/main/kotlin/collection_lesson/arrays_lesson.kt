package collection_lesson
fun main() {
    // create array
    val numbers = arrayOf(-1, 2, 40, 15, 61, 80, 90, 100)

    // Explicit Array Type: យើងអាចកំណត់ type ជាក់លាក់។
    val names: Array<String> = arrayOf("John", "Denise", "William", "Alice")

    // Integer Array
    val age: Array<Int> = arrayOf(19, 20, 30, 40, 50)

    // Mixed Type Array
    val data = arrayOf<Any>("dara", 20, true, 85) // don't recommend to use this array
    """
     Primitive Arrays:     
        IntArray, DoubleArray, FloatArray, LongArray, 
        ShortArray, ByteArray, BooleanArray, CharArray
    """
    // Example: IntArray
    val integerArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Creating Array by Size
    val nums = Array(5){
        0
    }
    println(nums.contentToString()) // [0, 0, 0, 0, 0]

    // Create Array Using index
    val number2 = IntArray(5){index -> index*10}
    println(number2.contentToString()) // [0, 10, 20, 30, 40]

    // Access Array Element
    // Use Index
    val fruits = arrayOf("Apple", "Banana", "Orange")
    println(fruits[0])
    println(fruits[1])

    // use get()
    println(fruits.get(2))

    // Updating Array Element
    // Use Index
    fruits[0] = "Grape"
    println(fruits.contentToString())

    // Use Set()
    println(fruits.set(2, "Mango"))

    // Array Size
    println(fruits.size) // 3

    // first()
    val studentName = arrayOf("John", "Denise", "William", "Alice")
    println(studentName.first()) // John
    // last()
    println(studentName.last()) // Alice

    // firstOrNull() -> useful when array is null
    val num3 = emptyArray<Int>()
    println(num3.firstOrNull()) // null
    // lastOrNull
    println(num3.lastOrNull()) // null

    // isEmpty()
    println(num3.isEmpty()) // true
    // isNotEmpty
    println(num3.isNotEmpty()) // false

    // indices ផ្តល់ range នៃ indexes
    println(studentName.indices) // 0..3
    // lastIndex
    println(studentName.lastIndex) // 3

    // loop with array with for
    for(name in studentName) {
        println(name)
    }

    // loop using indices
    for(i in studentName.indices){
        println("$i = ${studentName[i]}")
    }

    // forEach
    studentName.forEach{
        println(it)
    } // it មានន័យថា element បច្ចុប្បន្ន។

    // forEach with Parameter Name
    studentName.forEach{
        name -> println(name)
    }

    // forEachIndexed()
    studentName.forEachIndexed{index, name -> println("$index : $name")}

    """
    output   
     0 : John
     1 : Denise
     2 : William
     3 : Alice
    """

    // contains()
    println(studentName.contains("John")) // true

    // in operator
    println("William" in studentName) // true

    // indexOf()
    println(studentName.indexOf("Alice")) // 3

    // if not found
    println(studentName.indexOf("Dara")) // -1

    // lastIndexOf() useful when duplicate
    val num4 = arrayOf( 10, 20, 10, 30, 10)
    println(num4.lastIndexOf(10)) // 4
    // count()
    println(num4.count())
    // count() with condition
    val result = num4.count{ it>=10 }
    println(result)

    // sum()
    println(num4.sum()) // 80

    // average()
    println(num4.average()) // 16.0

    // minOrNull
    println(num4.minOrNull())

    // maxOrNull
    println(num4.maxOrNull())

    // sort
    num4.sorted()
    println(num4.contentToString()) // after sort

    // sortDecending
    num4.sortDescending()
    println(num4.contentToString())

    // sortedArray
    val sortedNum4 = num4.sortedArray()
    println(sortedNum4.contentToString())

    // sort vs sortedArray
    // sort(): ផ្លាស់ប្តូរ Array ដើម
    // sortedArray: បង្កើត Array ថ្មី Array ដើមនៅដដែល

    // reverse()
    val num5 = arrayOf( 1, 2, 3, 4 )
    num5.reverse()
    println(num5.contentToString()) // [4, 3, 2, 1]

    // reverseArray()
    val result2 = num5.reversedArray()
    println(result2.contentToString()) // array ដើមនៅដដែល។

    // random
    println(studentName.random()) // Result អាចជាឈ្មោះណាមួយក្នុង Array។

    // join to String: ប្រើបម្លែង Array ទៅ String។
    val teacherName = arrayOf("ann", "dara", "coca", "coke")
    val result3 = teacherName.joinToString(", ")
    println(result3)

    // Content To String
    println(teacherName.contentToString())

    // filter - show all matching element
    val teacherNameFilter = teacherName.filter{it == "dara"}
    println(teacherNameFilter)

    // map string
    val upperTeacherName = teacherName.map{name -> name.uppercase()}
    println(upperTeacherName)

    // find - show only first matching element
    val findTeacherName = teacherName.find {it == "ann"}
    println(findTeacherName)

    // firstOrNull
    val firstTeacherName = teacherName.firstOrNull{it.startsWith("c")}
    println(firstTeacherName)

    // convert ot mutable list ot delete
    val list = teacherName.toMutableList()
    list.remove("ann")
    list.add("kimnea")
    val newTeacherName = list.toTypedArray()
    println(newTeacherName.contentToString())

    // copy array
    val employeesName = newTeacherName.copyOf();
    println(employeesName.contentToString())




}

//    println(numbers2)
//    println(numbers3)
//    println("All > 0? ${numbers.all { it > 0 }}")
//    println("All < 0? ${numbers.any { it < 0 }}")
//    println("None > 10? ${numbers.none { it > 10 }}")
//
//    println("First 5: ${numbers.take(5).joinToString()}")
//    println("Last 3: ${numbers.takeLast(5).joinToString()}")
//    println("Drop first 5: ${numbers.drop(5).joinToString()}")
//
//    val withDuplicates = arrayOf(1, 2, 2, 3, 3, 3, 4)
//    println("Distinct: ${withDuplicates.distinct()}")

//    val numbers2 = arrayOfNulls<Int>(6)
//    val number3 = Array(5) { i -> i * i }
//    val number4 = intArrayOf(10, 20, 30)
//
//    println(numbers.sum())
//    println(numbers.average())
//    println(numbers.min())
//    println(numbers.max())
//    println(numbers.count())
//
//    // search operation

//    println("Index of 20: ${numbers.indexOf(20)}")
//    println("Contain 20: ${numbers.contains(20)}")
//    println("Element at index 2: ${numbers.elementAt(2)}")
//
//    // transformation (oldArray -> newArray)
//    val newNumbers = numbers.map { it * 2 }
//    println(newNumbers)
//
//    val evenNumbers = numbers.filter { it % 2 == 0 && it > 50 }
//    println(evenNumbers)
//
//    // sort
//    val sortedNumbers = numbers.sorted()
//    val sortedDescending = numbers.sortedDescending()
//    println(sortedNumbers)
//    println(sortedDescending)
//
//    // group
//    val grouped = numbers.groupBy { if (it > 20) "Greater than 20" else "Less than 20" }
//    println(grouped)

// update
//    numbers[3] = 10
//    numbers.set(3, 60)

// input
//    for(i in numbers2.indices){
//        print("Enter number: ")
//        numbers2[i] = readln().toInt();
//    }
//    // output
//    for(i in numbers2.indices){
//        print("Number3[$i]: ${numbers2[i]}")
//    }
//    println(numbers.contentToString())
//    println(numbers.size)
//    println(numbers.indices)
//    println(numbers.lastIndex)
//    println(numbers.last())
//    println("Index1: ${numbers[1]}")
//    println("Index2: ${numbers.get(3)}")
//    println("Is Number=50? ${50 in numbers}")
//    println("Is Number=60? ${60 in numbers}")
//    println(numbers2.contentToString())
