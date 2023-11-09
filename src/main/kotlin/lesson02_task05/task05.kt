package lesson02_task05

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val a = 0.167
    val percentOfDeposit = 16.7
    val years = 20
    val percent = percentOfDeposit / 100

    val formula = (depositAmount * ((1 + percent).pow(years)))
    val result = (String.format("%.3f", formula))
    println("Через 20 лет ваш вклад составит: $result рублей")
}