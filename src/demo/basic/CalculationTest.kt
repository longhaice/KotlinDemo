package demo.basic
//Kotlin⽀持数字运算的标准集（ + - * / % ），运算被定义为相应的类成员（但编译器会将函数调⽤优 化为相应的指令）

//整数除法
fun devide(a: Int,b: Int): Any{
    return a/b
}


fun main() {
    //请注意，整数间的除法总是返回整数。会丢弃任何⼩数部分
    println(devide(5,2))
    //对于任何两个整数类型之间的除法来说都是如此。
    val x1 = 5L / 2
    println(x1 == 2L)
    //如需返回浮点类型，请将其中的⼀个参数显式转换为浮点类型
    val x2 = (5 / 2).toDouble()
    val x3 = 5 / 2.toDouble()
    println("x2 = $x2 and x3 = $x3")

}