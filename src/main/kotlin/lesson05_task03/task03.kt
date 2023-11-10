package lesson05_task03

fun main() {

    val number1 = 11
    val number2 = 8

    println("Здравствуйте! Это игра-лотерея. Угадайте два числа от 0 до 42 и получите ценный приз. Удачи!")
    print("Введите число 1: ")
    val numberUser1 = readln().toInt()
    print("Введите число 2: ")
    val numberUser2 = readln().toInt()

    if((number1 == numberUser1 && number2 == numberUser2) || (number1 == numberUser2 && number2 == numberUser1)){
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if(number1 == numberUser1 || number1 == numberUser2 || number2 == numberUser1 || number2 == numberUser2){
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("Числа которые нужно было угадать для победы: $number1 и $number2")


}