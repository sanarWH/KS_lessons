package lesson04_task04

fun main(){

    val day = 5
    val parity = (day%2) == 0
    val arms = false
    val abs = false
    val back = true
    val legs = true

    val armsToday = arms == parity
    val absToday = abs == parity
    val backToday = back == parity
    val legsToday = legs == parity

    println("""
        |Упражнения для рук: $armsToday
        |Упражнения для ног: $legsToday
        |Упражнения для спины: $backToday
        |Упражнения для пресса: $absToday
    """.trimMargin())
}