fun main(){
    val age = 24
    val name = "vasi"
    val layers = 5
    val days = age*365
    val border = "`-._,-'"
    val timeToRepeat = 4


    printWish(border,timeToRepeat,name)

    printCakeCandle(age)

    printCakeTop(age)

    printCakeBottom(age,layers)

    printCakeBorder(age)

    printMessage("vasiharan",24,days)



}

fun printWish(border:String, timeToRepeat:Int, name: String){
    println()
    printBorder(border, timeToRepeat)
    println("  Happy Birthday, ${name}!")
    printBorder(border, timeToRepeat)
    println()
}

fun printMessage(n :String, a:Int, d: Int){
    println()
    println("You are now ${a} years old ${n}")
    println("You've successfully completed ${d} days in your journey")
}

fun printBorder(border : String, timeToRepeat: Int) {
    repeat(timeToRepeat){
        print(border)
    }
    println()
}


fun printCakeCandle(age : Int){
    print(" ")
    repeat(age){
        print(',')
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeTop(age : Int){
    repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeBottom(age : Int, layer: Int){
    repeat(layer){
        repeat(age + 2){
            print("@")
        }
        println()
    }
}

fun printCakeBorder(age : Int){
    repeat(age+2){
        print("=")
    }
    println()
}