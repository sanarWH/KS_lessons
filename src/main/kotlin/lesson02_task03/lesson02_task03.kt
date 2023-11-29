package lesson02_task03

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTimeInMinutes = 457
    val unitOfTime = 60

    val totalMinutes = (departureHours * unitOfTime + departureMinutes + travelTimeInMinutes)
    val arrivalHours = totalMinutes / unitOfTime
    val arrivalMinutes = totalMinutes % unitOfTime
    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")


}