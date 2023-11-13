package lesson06_task02

import kotlin.concurrent.thread

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val timer = readln().toInt()
    var seconds = timer


    while (seconds > 0){
        seconds--
        Thread.sleep(1000)
    }
    println("Прошло $timer секунд.")
}