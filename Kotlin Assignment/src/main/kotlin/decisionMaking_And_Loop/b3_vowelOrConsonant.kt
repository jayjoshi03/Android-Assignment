package decisionMaking_And_Loop

fun main() {
    print("Enter a Character: ")
    when(readln()){
        "A","E","I","O","U","a","e","i","o","u" -> println("Vowel!!")
        else -> println("Consonant!!")
    }
}