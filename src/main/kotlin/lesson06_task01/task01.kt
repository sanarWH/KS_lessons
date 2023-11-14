package lesson06_task01

fun main() {
    print("Окно регистрации \nВведите логин: ")
    val createLogin = readln()
    print("Введите пароль: ")
    val createPassword = readln()

    print("Окно авторизации. \nВведите ваш логин: ")
    val userLogin = readln()
    print("Введите ваш пароль:")
    val userPassword = readln()

    while (userLogin == createLogin && userPassword == createPassword){
        if(userLogin == createLogin && userPassword == createPassword){
            println("Авторизация прошла успешно")
            break
        }else if (userLogin != createLogin || userPassword != createPassword){ //не понимаю, почему блок кода ниже не работает
            println("Логин или пароль введены неверно. Попробуйте еще раз.")
            print("Введите ваш логин: ")
            val userLogin = readln()
            print("Введите ваш пароль:")
            val userPassword = readln()
        }
    }
}