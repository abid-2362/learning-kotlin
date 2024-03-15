fun main(args: Array<String>) {
    println("Learning Kotlin")

    val myCharValue: Char = 'D'
    val booleanValue: Boolean = true
    val byteMaxValue: Byte = Byte.MAX_VALUE
    val shortMaxValue: Short = Short.MAX_VALUE
    val intMaxValue: Int = Int.MAX_VALUE
    var longMaxValue: Long = Long.MAX_VALUE


    println("(3 + 3) * 4 = ${(3+3) * 4}")

    var test: String = "This is a test string"
    test = "learning again"
    println("Something $test")

    var x = 0
    println("x = ${x++}") // first returned the value of x i.e 0 and then incremented it; now in the environment, the value is 1, but returned zero
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")
    println("x = ${--x}")

}