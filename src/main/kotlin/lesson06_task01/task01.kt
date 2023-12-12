package lesson06_task01

fun main() {
    print("Окно регистрации \nВведите логин: ")
    val createLogin = readln()
    print("Введите пароль: ")
    val createPassword = readln()

    do {
        print("Окно авторизации. \nВведите ваш логин: ")
        val userLogin = readln()
        print("Введите ваш пароль:")
        val userPassword = readln()
    } while (userLogin != createLogin && userPassword != createPassword)

    println("Добро пожаловать!")
}