package lesson04_task03

fun main() {

    val isSunnyNow = true
    val isAwningNowOpen = true
    val wetNow = 20
    val seasonNow ="Зима"

    val conditionsSuitable = isSunnyNow == IS_WEATHER_SUNNY && isAwningNowOpen == IS_AWNING_OPEN && wetNow == WET && seasonNow == SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_AWNING_OPEN = true
const val WET = 20
const val SEASON = "Не зима"
