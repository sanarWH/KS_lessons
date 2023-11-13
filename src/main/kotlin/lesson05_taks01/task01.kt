package lesson05_taks01

fun main() {

    val numberOne = 2
    val numberTwo = 2
    val solution = numberOne + numberTwo
    print("Докажите, что вы не робот. Решите пример и напишете ваш ответ: $numberOne + $numberTwo = ")
    val solutionUser: Int = readln()!!.toInt()

    if(solutionUser == solution) println("Добро пожаловать!")
    else println("Доступ запрещен")

}