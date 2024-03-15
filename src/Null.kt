fun main(args: Array<String>) {
    var text: String? = "Name"

    println(text?.length)

    if(text != null) {
        println(text.length)
    } else {
        println("The variable is null")
    }

    println(text?.length)


//    forcefully throwing a null pointer exception
//    val text2: String? = null
//    println(text2!!.length)

    val nullVal: String? = null
    val nonNullVal: String? = "This is not null"
    val result3 = nonNullVal ?: "The variable is null"
    println(result3)
}
