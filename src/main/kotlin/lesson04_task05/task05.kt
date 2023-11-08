package lesson04_task05

fun main() {
    //Вводные данные:
    val conditionShip = true //false - судно не имеет провреждений
    val numberOfCrew = 70
    val provisions = 55
    val weather = true //true - благоприятная, false - неблагоприятная

    //Данные необходимые для отправления судна:
    val conditionShipStart = false
    val numberOfCrewMin = 55..70
    val provisionsMin = 50

    //Данные необходимые для альтернативного отправления судна:
    val numberOfCrewMinAlt = 70
    val provisionsMinAlt = 50
    val weatherStartAlt = true


    val go = (conditionShip == conditionShipStart) && (numberOfCrew in numberOfCrewMin) &&
            (provisions >= provisionsMin)
    val goAlt = (numberOfCrew >= numberOfCrewMinAlt) && (provisions >= provisionsMinAlt)
            && (weather == weatherStartAlt)

    val start = true == go || true == goAlt

    println("Разрешение на выход коробля в долгосрочное плавание: $start. " +
            "(Примечание: true - выход разрешен, false - выход запрещен")


}