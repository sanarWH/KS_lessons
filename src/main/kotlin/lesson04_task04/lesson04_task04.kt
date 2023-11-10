package lesson04_task04

fun main(){

    val day = 5
    val isEvenDay = (day%2) == 0 //не понимаю, что тут не так, автоформатирования нет. Предлагает только игнорировать или изменить самостоятельно
    val armsAndAbs = false
    val backAndLegs = true

    val armsAndAnsToday = armsAndAbs == isEvenDay
    val backAndLegsToday = backAndLegs == isEvenDay

    println("""
        |Упражнения для рук: $armsAndAnsToday
        |Упражнения для ног: $backAndLegsToday
        |Упражнения для спины: $backAndLegsToday
        |Упражнения для пресса: $armsAndAnsToday
    """.trimMargin())
}