package lesson07_task03

fun main() {
    print("Это программа выведет все четные числа от нуля до вашего числа. \nВведите ваше число: ")
    val userNumber = readln().toInt()
    val evenNumbers = 0 until userNumber step 2
    println("Вывожу четные числа от 0 до $userNumber: ")

    for (i in evenNumbers){
        println(i)
    }
}