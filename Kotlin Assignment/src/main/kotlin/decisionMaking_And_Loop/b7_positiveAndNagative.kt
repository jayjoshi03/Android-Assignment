package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter Number: ")
    val num = sc.nextInt()
    if (num>0){
        println("$num is Positive!!")
    }
    else if (num==0){
        println("$num is Neutral!!")
    }
    else{
        println("$num is Negative!!")
    }
}