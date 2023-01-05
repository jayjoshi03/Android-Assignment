package kotlin_Fundamental

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter a Number: ")
    val num = sc.nextInt()
    if (num%2==0){
        println("$num is Even!!")
    }
    else{
        println("$num is Odd!!")
    }
}