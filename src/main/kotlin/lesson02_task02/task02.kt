package lesson02_task02

fun main(){

    val workersOfCompany = 50
    val traineesOfCompany = 30
    val salariesWorkers = 30000
    val salariesTrainees = 20000

    val expensesWorkers = workersOfCompany * salariesWorkers
    val expensesWorkersAndTrainees = (workersOfCompany * salariesWorkers) + (traineesOfCompany *salariesTrainees)
    val averageSalary = expensesWorkersAndTrainees / (workersOfCompany+traineesOfCompany)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesWorkers ")
    println("Общие расходы по ЗП после прихода стажеров: $expensesWorkersAndTrainees")
    println("Средняя ЗП одного сотрудника: $averageSalary ")
}