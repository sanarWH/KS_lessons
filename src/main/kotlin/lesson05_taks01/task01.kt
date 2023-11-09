package lesson05_taks01

fun main() {

    val numberOne = 2
    val numberTwo = 2
    val solution = numberOne + numberTwo
    println("Докажите, что вы не робот. Решите пример и напишете ваш ответ: $numberOne + $numberTwo = ")
    val solutionUser: Int = readLine()!!.toInt()

    if(solutionUser == solution) println("Добро пожаловать!")
    else println("Доступ запрещен")

}