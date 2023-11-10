package lesson04_task02

fun main(){


    var cargoWeight1 = 20
    var cargoVolume1 = 80

    var cargoWeight2 = 50
    var cargoVolume2 = 100

    println("Груз с весом: $cargoWeight1; и объемом: $cargoVolume1; соответствует категории Average: " +
            "${cargoWeight1 >= AVERAGEWEIGHTMIN && cargoWeight1 <= AVERAGEWEIGHTMAX && cargoVolume1 < AVERAGEVOLUME}")

    println("Груз с весом: $cargoWeight2; и объемом: $cargoVolume2; соответствует категории Average: " +
            "${cargoWeight2 >= AVERAGEWEIGHTMIN && cargoWeight2 <= AVERAGEWEIGHTMAX && cargoVolume2 < AVERAGEVOLUME}")
}
const val AVERAGEWEIGHTMIN = 35
const val AVERAGEWEIGHTMAX = 100
const val AVERAGEVOLUME = 100