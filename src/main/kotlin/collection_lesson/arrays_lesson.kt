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
    /*
     Primitive Arrays:     
        IntArray, DoubleArray, FloatArray, LongArray, 
        ShortArray, ByteArray, BooleanArray, CharArray
    */
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

    // copy of Range // ចំណាំ៖ end index មិនត្រូវបានរាប់បញ្ចូល។
    val result5 = employeesName.copyOfRange(1, 4)
    println(result5.contentToString())

    val num7 = Array(5) { 2}

    numbers.fill(100)
    println(numbers.contentToString())

    // Array Equality មិនគួរប្រៀបធៀប arrays ដោយ == បើចង់ប្រៀបធៀប contents។
    // We use:
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(a.contentEquals(b))

    // distinct យកតម្លៃដែលមិនស្ទួន
    val c = arrayOf(1, 1, 2, 3, 2, 5, 5, 4, 6, 7)
    val resultC = c.distinct().sorted()
    println(resultC)

    // Nested Array : Array អាចមាន Array ខាងក្នុង
    // Array 2D
    val data2 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6)
    )
    /* contentDeepToString(): គឺជា Function ក្នុង Kotlin ដែលប្រើសម្រាប់បង្ហាញធាតុទាំងអស់នៅក្នុង
    Nested Array ឬ Array ដែលមាន Array នៅខាងក្នុង។
     */
    println(data2.contentDeepToString())

    /*
        mapNotNull() មានប្រយោជន៍នៅពេល Array មាន Nullable Data។
     */
    val numbers8 = arrayOf(10, null, 20, null, 30)
    val result8 = numbers8.mapNotNull { it }
    println(result8)
    /*
    fold()
     */
    val numbers9 = arrayOf(10, 20, 30, 40)
    val sum = numbers9.fold(0) { total, number ->
        total + number
    }
    println(sum)

}
