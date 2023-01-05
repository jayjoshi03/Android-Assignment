package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0
    var temp = 0
    var mul = 1
    print("Enter Armstrong Number Range: ")
    var rg = sc.nextInt()

    for (j in 1..rg) {
        var num = j
        var noCount = num.toString().length.toInt()
        var num1 = num
        while (num != 0) {
            mul = 1
            temp = num % 10
            num /= 10
            for (i in 1..noCount) {
                mul *= temp
            }
            sum += mul
        }
        if (sum == num1) {
            print("$num1\t")
        }
        sum = 0
        temp = 0
        mul = 1
    }
}
