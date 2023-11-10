package lesson04_task03

fun main() {

    val isSunnyNow = true
    val isAwningNowOpen = true
    val wetNow = 20
    val seasonNow ="Зима"

    val conditionsSuitable = isSunnyNow == ISWEATHERSUNNY && isAwningNowOpen == ISAWNINGOPEN && wetNow == WET && seasonNow == SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}
const val ISWEATHERSUNNY: Boolean = true
const val ISAWNINGOPEN = true
const val WET = 20
const val SEASON = "Не зима"
