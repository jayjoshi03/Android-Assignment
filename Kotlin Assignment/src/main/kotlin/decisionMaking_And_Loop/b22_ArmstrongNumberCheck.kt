package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0
    var temp = 0
    var mul = 1
    print("Enter Value Check Armstrong Number: ")
    var num = sc.nextInt()
    var noCount = num.toString().length.toInt()
    var num1 = num

    while (num!=0){
        mul = 1
        temp = num%10
        num /= 10
        for (i in 1..noCount) {
            mul *= temp
        }
        sum += mul
    }
    if (sum==num1){
        println("$num1 is Armstrong Number!!")
    }
    else{
        println("$num1 is Not Armstrong Number!!")
    }

}