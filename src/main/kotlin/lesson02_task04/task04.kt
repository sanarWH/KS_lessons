package lesson02_task04

fun main() {
    val crystalExtracted = 7
    val ironExtracted = 11
    val buff = 0.2

    val crystalExtractedWithBuff = crystalExtracted * buff
    val ironExtractedWithBuff = ironExtracted * buff
    val crystalExtractedWithBuffToInt = crystalExtractedWithBuff.toInt()
    val ironExtractedWithBuffToInt = ironExtractedWithBuff.toInt()

    println("Кристаллов дабыто за счет баффа $crystalExtractedWithBuffToInt")
    println("Железа дабыто за счет баффа $ironExtractedWithBuffToInt")
}