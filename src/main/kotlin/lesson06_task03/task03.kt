package lesson06_task03

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    var timer = readln().toInt()
    while (timer > 0){
        println("Осталось секунд $timer")
        timer--
        Thread.sleep(1000)
    }
    println("Время вышло")
}