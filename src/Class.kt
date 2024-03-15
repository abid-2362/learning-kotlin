fun main() {
    val user1 = User("Abid", "Ali", 34)
    val user2 by lazy {
        User("Sajid", "Ali", user1.age - 2)
    }

    println(user2.lastName)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}



