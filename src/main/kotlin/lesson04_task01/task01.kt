package lesson04_task01

fun main(){

    val isTableTodayReserved = 13 != TABLES
    val isTableTomorrowReserved = 9 != TABLES

    println("Доступность столиков на сегодня:: $isTableTodayReserved \n" +
            "Доступность столиков на завтра: $isTableTomorrowReserved")

}
const val TABLES = 13