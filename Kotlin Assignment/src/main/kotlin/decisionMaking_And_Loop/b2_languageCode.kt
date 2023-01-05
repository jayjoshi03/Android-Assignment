//Read language code from command line and print “Hello” if EN , print “Salut” if FR, print “Ciao” ifIT.
//(when)

package decisionMaking_And_Loop

fun main() {
    print("Enter Language Code: ")
    when(readLine()?.uppercase()){
        "EN" -> {
            println("Hello")
        }
        "FR" -> {
            println("Salut")
        }
        "IT" -> {
            println("Ciao")
        }
    }

}