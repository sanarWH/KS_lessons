package lesson03_task05

fun main() {
    val receivedData = "D2-D4;0"
//    var from = [receivedData.split("@")[0].takeLast()]
    var from1 = receivedData[0]
    var from2 = receivedData[1]
    var fromResult = "$from1$from2"

    var move1 = receivedData[3]
    var move2 = receivedData[4]
    var moveResult = "$move1$move2"

    var numMove = receivedData[6]
    println("Игрок сделал ход из клетки $fromResult в клетку $moveResult. Ход номер: $numMove")

}

