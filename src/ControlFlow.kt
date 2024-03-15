fun main(args: Array<String>) {
    val alarm = 7

//    when (alarm) {
//        12 -> println("The time is $alarm")
//        7 -> println("The time is $alarm")
//        14 -> println("The time is $alarm")
//        else -> println("The time is $alarm")
//    }
    val wlarm = 12
    // similar to switch in JavaScript
    when (alarm) {
        !in 1..10 -> {
            println("The number is in the range 1..10")
        }

        12, 7, 14 -> println("The $alarm is either 12 or 7 or 14")

        else -> println("else block executed")
    }

    // to assign back the value
    val text = when (alarm) {
        in 1..10 -> {
            "the number is in range 1 to 10"
        }

        12, 7, 14 -> {
            "The number is $alarm"
        }

        else -> {
            "The time is $alarm"
        }
    }

    println(text)

    // to use logical operators remove argument from when
    val text2 = when {
        alarm == 8 -> "$alarm is 8"
        alarm <= 7 -> "$alarm is less than or equal to 7"
        else -> "$alarm is greater than 8"
    }
    println(text2)
}
