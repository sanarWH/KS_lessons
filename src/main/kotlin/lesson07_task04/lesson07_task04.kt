package lesson07_task04

fun main() {
    print("Я таймер, помогу вам засечь время. Введите количество секунд, которые нужно засечь: ")
    var timer = readln().toInt()

    do{
        println("Осталось $timer секунд")
        timer--
        Thread.sleep(1000)
    } while (timer == 0)
}
//не понимаю, почему код не работает и программа останавливается

