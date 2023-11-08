package lesson04_task03

fun main() {
    val weather: Boolean = true
    val awning = true
    val wet = 20
    val season = "Не зима"

    val weatherNow = true //солнечная погода - true, любая другая - false
    val awningNow = true //тент открыт - true, тент закрты - false
    val wetNow = 20
    val seasonNow ="Зима"

    val conditionsSuitable = weatherNow == weather && awningNow == awning && wetNow == wet && seasonNow == season

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}