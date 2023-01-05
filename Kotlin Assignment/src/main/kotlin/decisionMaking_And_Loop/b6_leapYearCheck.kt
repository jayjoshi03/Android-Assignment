package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter Year for Check Leap Year: ")
    val year = sc.nextInt()
    if (year%4==0 && year%100 != 0 || year%400==0){
        println("$year is Leap Year!!")
    }
    else{
        println("$year is Not Leap Year!!")
    }
}