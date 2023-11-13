package lesson04_task02

fun main(){


    var cargoWeight1 = 20
    var cargoVolume1 = 80

    var cargoWeight2 = 50
    var cargoVolume2 = 100

    println("Груз с весом: $cargoWeight1; и объемом: $cargoVolume1; соответствует категории Average: " +
            "${cargoWeight1 >= AVERAG_EWEIGHT_MIN && cargoWeight1 <= AVERAGE_WEIGHT_MAX && cargoVolume1 < AVERAGE_VOLUME}")

    println("Груз с весом: $cargoWeight2; и объемом: $cargoVolume2; соответствует категории Average: " +
            "${cargoWeight2 >= AVERAG_EWEIGHT_MIN && cargoWeight2 <= AVERAGE_WEIGHT_MAX && cargoVolume2 < AVERAGE_VOLUME}")
}
const val AVERAG_EWEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100