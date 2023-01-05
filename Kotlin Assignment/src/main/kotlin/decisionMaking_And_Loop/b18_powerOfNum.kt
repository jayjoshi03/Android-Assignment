package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter Value: ")
    val num = sc.nextInt()
    print("Enter Of Power value: ")
    var countv = sc.nextInt()
    var result = 1

    for (i in 1..countv) {
        result *= num
    }

    println("Answer = $result")
}