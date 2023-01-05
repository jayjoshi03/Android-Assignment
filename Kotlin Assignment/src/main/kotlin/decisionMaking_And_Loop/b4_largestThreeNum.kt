package decisionMaking_And_Loop

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter A Number:")
    val a = sc.nextInt()
    print("Enter B Number:")
    val b = sc.nextInt()
    print("Enter C Number:")
    val c = sc.nextInt()
    if (a==b || b==c || a==c ){
        if (a==b){
            println("a and b is equal! " + "and c is different")
        }
        else if (a==c){
            println("a and c is equal! " + "and b is different")
        }
        else{
            println("b and c is equal! " + "and a is different")
        }
    }
    else if (a>b && a>c)
    {
        println("a is greater!")
    }
    else if (b>a && b>c){
        println("b is greater!")
    }
    else{
        println("c is greater!")
    }
}