package kotlin_Fundamental

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter Num1: ")
    var num1 = sc.nextInt()
    print("Enter Num2: ")
    var num2 = sc.nextInt()
    println("Before Num1: $num1 and Num2: $num2")

    var temp = num1
    num1 = num2
    num2 = temp

    println("After Num1: $num1 and Num2: $num2")

}
