package demo.basic
//⽬录与包的结构⽆需匹配：源代码可以在⽂件系统的任意位置。

//Kotlin 应⽤程序的⼊⼝点是 main 函数。
fun main() {
    println("Hello Kotlin")
    /*声明变量，运算和字符串模板*/
    var num1: Int = 1
    val num2: Int = num1
    var sum1 = num1 + num2
    // 字符串模板取值或表达式运算结果
    println("sum of $num1 and $num2 is $sum1")

    /*对变量赋值和函数运算*/
    num1 = 2
    // num2 = 2 val无法再次赋值
    // main函数中可以声明函数
    fun sum(a: Int,b: Int):Int{
        return a+b
    }
    var sum2 =sum(num1 , num2)
    print("sum of $sum1 and $sum2 is ${sum1+sum2}")
}