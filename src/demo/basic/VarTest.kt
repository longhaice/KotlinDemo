package demo.basic

// 你可以使⽤下划线使数字常量更易读
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
fun printAll(){
    printOthers(oneMillion)
    printOthers(creditCardNumber)
    printOthers(socialSecurityNumber)
    printOthers(hexBytes)
    printOthers(bytes)
}
// 注意数字装箱不⼀定保留同⼀性:
fun box(){
    val a: Int = 10000
    val str: String = "this is a string"
    println(a === a)// 输出“true”
    println(a == a) // 输出“true”
    println(str === str)// 输出“true”
    println(str == str) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    val boxedStr:String?= str
    val anoterBoxedStr: String? = str
    println(boxedA === anotherBoxedA)// ！！！输出“false”！！！
    println(boxedA == anotherBoxedA) // 输出“true”
    println(boxedStr === anoterBoxedStr)//  输出“true”:wq

    println(boxedStr == anoterBoxedStr) // 输出“true”
}

fun toTransfer(){

    // var v: Double = 97.9999000000000
    // var v: Float = 97.9999f
    var v: Double = 97.9999000000001
    var value1 = v.toByte()
    var value2 = v.toShort()
    var value3 = v.toInt()
    var value4 = v.toLong()
    var value5 = v.toFloat()
    var value6 = v.toDouble()
    var value7 = v.toChar()
    var value8 = v.toString()

    printOthers(value1)
    printOthers(value2)
    printOthers(value3)
    printOthers(value4)
    printOthers(value5)
    printOthers(value6)
    printOthers(value7)
    printOthers(value8)

}
fun main() {
    //printAll()
    //box()
    toTransfer()



}
