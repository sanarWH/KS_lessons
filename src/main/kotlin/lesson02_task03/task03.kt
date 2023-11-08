package lesson02_task03

fun main(){

    val trainDepartureTime = 7.45
    val travelTimme = 232
    val unitTime = 60

    val departureInHours = trainDepartureTime.toInt()
    val departureInMinutes = (trainDepartureTime * 60)
    val x = departureInMinutes % 60

    val travelTimeInHours= travelTimme / unitTime
    val travelTimeInMinutes = travelTimme % unitTime

    val sumMinutes = departureInMinutes + travelTimeInMinutes

    var a = 9.39
    var b = a * 60
    var c = b % 60
    println(c)





//    val trainDepartureTimeInMinutes = trainDepartureTime * unitTime //переводим часы отправления в минуты
//    val timeInMinutes = (trainDepartureTimeInMinutes + travelTimme) //складываем время отправления и вермя в пути
//    val timeInHours = timeInMinutes / unitTime // перводим время в часы
//    val arrivalTimeInHours = timeInHours.toInt() // отбрасываем остаток, чтобы верно рассчитать минуты
//    val arrivalTimeInMinutes = timeInMinutes % unitTime // выделяем остаток
//    val arrivalTimeInRealMinutes = arrivalTimeInMinutes * unitTime  // верно рассчитываем минуты из остатка
//
//    println(arrivalTimeInHours)
//    println(arrivalTimeInRealMinutes)
//    println(arrivalTimeInMinutes)
//    println(timeInHours)


}
// В 17:16 должен прибывать поезд