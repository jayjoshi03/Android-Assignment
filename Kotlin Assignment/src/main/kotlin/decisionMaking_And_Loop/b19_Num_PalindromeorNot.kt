package decisionMaking_And_Loop

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var result:Int
    var rev=0
    var num=a

   while (a!=0){
       result=a%10
       a /= 10
       rev = rev*10 + result
   }

    /*
    Other Method
    var re=a.toString().reversed().toInt()
    println(re)
     */

    println(rev)
    if(num==rev){
        println("$num is Palindrome!!")
    }
    else{
        println("$num is Not Palindrome!!")
    }



}