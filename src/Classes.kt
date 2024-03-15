class User1(var name: String, var age: Int) {
    fun greeting() {
        println("Hello $name")
    }
}


object Database {
    init {
        println("Database created")
    }
}
