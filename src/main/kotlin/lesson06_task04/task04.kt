package lesson06_task04

fun main(){
    val number = (1..9).random()
    print("Угадайте число от 1 до 9 за 5 попыток. Введите число: ")
    var userNumber = readln().toInt()
    var tryNumber = 5

    while(tryNumber > 0){
        if (userNumber == number && tryNumber > 1){
            println("Это была великолепная игра")
            break
        } else if ( userNumber != number && tryNumber > 1){
            tryNumber--
            print("Вы не угадали число. Попыток осталось $tryNumber. Угадайте число еще раз:")
            userNumber = readln().toInt()
        } else {
            println("Вы проиграли. Было загадано число $number")
            break
        }


        }
    }

