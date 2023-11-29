package lesson03_task05

fun main() {
    val receivedData = "D2-D4;0"

    val from1 = receivedData[0]
    val from2 = receivedData[1]
    val fromResult = "$from1$from2"

    val move1 = receivedData[3]
    val move2 = receivedData[4]
    val moveResult = "$move1$move2"

    val numMove = receivedData[6]
    println("Игрок сделал ход из клетки $fromResult в клетку $moveResult. Ход номер: $numMove")

}