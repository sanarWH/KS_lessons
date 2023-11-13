package lesson06_task03

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val timer = readln().toInt()
    var seconds = timer
    while (seconds > 0){
        println("Осталось секунд $seconds")
        seconds--
        Thread.sleep(1000)
    }
    println("Время вышло")
}