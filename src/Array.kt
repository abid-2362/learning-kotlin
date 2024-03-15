fun main() {
    val names = arrayOf("Learning", "Something", "New", "Is", "a", "Good", "Thing")
    val numbers = arrayOf(4,5,6,7,8,9, "Name 1", 'a')

    for (i in numbers) {
        if(i is Int) {
            println(i)
        }
    }

//    println()
}
