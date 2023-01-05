package kotlin_Fundamental

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a Santance fist and last space remove:")
    val str = sc.nextLine()
    println()
    println("original: $str")
    println("size: ${str.length}")

    println("---------------------")
    println("remove space: ${str.trim()}")
    println("size: ${str.trim().length}")
}