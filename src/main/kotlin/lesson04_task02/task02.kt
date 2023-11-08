package lesson04_task02

fun main(){

    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolume = 100

    var cargoWeight1 = 20
    var cargoVolume1 = 80

    var cargoWeight2 = 50
    var cargoVolume2 = 100

    println("Груз с весом: $cargoWeight1; и объемом: $cargoVolume1; соответствует категории Average: " +
            "${cargoWeight1 >= averageWeightMin && cargoWeight1 <= averageWeightMax && cargoVolume1 <= averageVolume}")

    println("Груз с весом: $cargoWeight2; и объемом: $cargoVolume2; соответствует категории Average: " +
            "${cargoWeight2 >= averageWeightMin && cargoWeight2 <= averageWeightMax && cargoVolume2 <= averageVolume}")
}