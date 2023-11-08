package lesson02_task04

fun main() {
    val crystalExtracted = 7
    val ironExtracted = 11
    val buff: Float = 20f //указать процент баффа
    val buffToPerсent: Float = buff / 100

    val crystalExtractedWithBuff = crystalExtracted * buffToPerсent
    val ironExtractedWithBuff = ironExtracted * buffToPerсent
    val crystalExtractedWithBuffToInt = crystalExtractedWithBuff.toInt()
    val ironExtractedWithBuffToInt = ironExtractedWithBuff.toInt()

    println("Кристаллов дабыто за счет баффа $crystalExtractedWithBuffToInt")
    println("Железа дабыто за счет баффа $ironExtractedWithBuffToInt")
}