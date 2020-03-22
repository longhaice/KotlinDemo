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
    println(boxedStr === anoterBoxedStr)//  输出“true”
    println(boxedStr == anoterBoxedStr) // 输出“true”
}
fun main() {
    //printAll()

    box()

}
