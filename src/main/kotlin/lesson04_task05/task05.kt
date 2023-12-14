package lesson04_task05

fun main() {
    //Вводные данные:
    val isConditionShip = true
    val numberOfCrew = 70
    val provisions = 56
    val isWeather = true

    //Данные необходимые для отправления судна:
    val isConditionShipStart = false
    val numberOfCrewMin = 55..70
    val provisionsMin = 50

    //Данные необходимые для альтернативного отправления судна:
    val numberOfCrewMinAlt = 70
    val provisionsMinAlt = 50
    val weatherStartAlt = true


    val go = (isConditionShip == isConditionShipStart) && (numberOfCrew in numberOfCrewMin) &&
            (provisions >= provisionsMin)
    val goAlt = (numberOfCrew >= numberOfCrewMinAlt) && (provisions >= provisionsMinAlt)
            && (isWeather == weatherStartAlt)

    val start = true == go || true == goAlt

    println("Разрешение на выход коробля в долгосрочное плавание: $start. " +
            "(Примечание: true - выход разрешен, false - выход запрещен")


}