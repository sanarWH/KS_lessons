package lesson02_task05

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val percent = 0.167
    val years = 20

    val formulaFirstPart = 1 + percent
    val formulaSecondPart = formulaFirstPart.pow(years)
    val formulaThritPart = depositAmount * formulaSecondPart
    val result = (String.format("%.3f", formulaThritPart))
    println("Через 20 лет ваш вклад составит: $result рублей")

}