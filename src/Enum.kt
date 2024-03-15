fun main() {
//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.SOUTH)
//    println(Direction.NORTH)
//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.distance)
//    println(Direction.NORTH.name)

//    Direction.WEST.printData()


//    val direction = Direction.NORTH
    val direction = Direction.valueOf("east".uppercase())
    when (direction) {
        Direction.WEST -> println("The direction is West")
        Direction.EAST -> println("The direction is East")
        Direction.SOUTH -> println("The direction is South")
        Direction.NORTH -> println("The direction is North")
        else -> println("Direction is Unknown")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction")
        println("Distance = $distance")
    }
}
