package lesson04_task01

fun main(){

    val tables = 13
    val reservedTableToday = 13 != tables
    val reservedTableTomorrow = 9 != tables

    println("Доступность столиков на сегодня:: $reservedTableToday \n" +
            "Доступность столиков на завтра: $reservedTableTomorrow")

}