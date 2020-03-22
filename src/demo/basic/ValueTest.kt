package demo.basic

var value1: Byte = 8
var value2: Short = 16
var value3: Int = 32
var value4: Long = 64L
var value5: Float = 0.0032F
var value6: Double = 0.000064

var value7: String = "This is a string"

// 所有以未超出 Int 最⼤值的整型值初始化的变量都会推断为 Int 类型。
// 如果初始值超过了其最⼤ 值，那么推断为 Long 类型。
// 如需显式指定 Long 型值，请在该值后追加 L 后缀。
val one = 1 // Int
val threeBillion = 3000000000 // Long
val oneLong = 1L // Long
val oneByte: Byte = 1
val pi = 3.14 // Double
val e = 2.7182818284 // Double
val eFloat = 2.7182818284f // Float，实际值为 2.7182817

fun printOthers(v: Any?){
    println(v)
}
// 请注意，与⼀些其他语⾔不同，Kotlin 中的数字没有隐式拓宽转换。
// 例如，具有 Double 参数的函数只 能对 Double 值调⽤，⽽不能对 Float 、Int 或者其他数字值调⽤。
fun printDouble(v: Double?){
    println(v)
}
fun printFloat(v: Float?){
    println(v)
}

fun main() {
    println(value1)
    println(value2)
    println(value3)
    println(value4)
    println(value5)
    println(value6)
    println(value7)

    printOthers(value1)
    printOthers(value2)
    printOthers(value3)
    printOthers(value4)
    printOthers(value5)
    printOthers(value6)
    printOthers(value7)

    printDouble(e)
    printFloat(eFloat)


}