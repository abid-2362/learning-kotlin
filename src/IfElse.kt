fun main() {
    val isActive = 100
    if(isActive > 150) {
        println("The number is > 150")
    } else if(isActive > 90) {
        println("The number is > 90")
    }

    val isPlaying = true
    val minScore = 100
    if(isPlaying && minScore >= 100) {
        println("Player is playing with a score of more than $minScore")
    }

    if (isPlaying || minScore >= 100) {
        println("Player is playing")
    }

}
