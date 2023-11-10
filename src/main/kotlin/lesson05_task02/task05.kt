package lesson05_task02

fun main() {

    print("Введите ваш год рождения: ")
    val majorityUser = readln().toInt()

    val thisYear = 2023
    var accessToContent = thisYear - majorityUser

    if(accessToContent >= MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ к скрытому контенту запрещен")

}
const val MAJORITY = 18