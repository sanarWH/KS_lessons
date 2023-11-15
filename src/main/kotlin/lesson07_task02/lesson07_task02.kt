package lesson07_task02

import kotlin.random.Random

fun main(){

    do {
        val codeGenerator = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $codeGenerator")
        print("Введите код чтобы авторизоваться: ")
        val userAuthorization = readln().toInt()

        if (userAuthorization == codeGenerator) {
            println("Добро пожаловать!")
        }
    } while(userAuthorization != codeGenerator)
}