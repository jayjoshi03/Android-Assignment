package kotlin_Fundamental

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a Character: ")
    val ch = sc.next().single()
    val ascii = ch.toInt()
    println("$ch ASCII Value is: $ascii")

}
