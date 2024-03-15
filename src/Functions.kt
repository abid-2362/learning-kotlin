fun main(args: Array<String>) {
//    greetings()
//    greetings("Abid")
//    greetings2("Abid", 32)
//    println(getHigherMarks(23, 25))
    println("The sum is ${sum(5, 6, 7, 8, 8, 9, 90, 10, 100)}")
    println("The sum is ${sumForEach(5, 6, 7, 8, 8, 9, 90, 10, 100)}")
}

fun greetings(name: String = "There") {
    println("Hello $name")
}


fun greetings2(name: String = "There", age: Int = 0) {
    if (age <= 0) {
        return println("Hello $name, It seems you're a new born baby")
    }
    println("Hello $name, your age is $age")
}


// returning data from the function
fun getHigherMarks(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }

    return result
}

fun sumForEach(vararg numbers: Int) : Int {
    var result = 0
    numbers.forEach {
        result += it
    }
    return result
}
