// Constant
const val PI = 3.1416

fun main(args: Array<String>) {
    val color = "Red"

    when (color) {
        "Yellow" -> println("Color is yellow, Sun")
        "Red","Ruby" -> {
            println("Color is red")
            println("Ruby")
        }
        else -> println("Error: Color not found")
    }

    val code = 200

    when (code) {
        in 200..299 -> println("OK")
        in 400..499 -> println("Error")
        in 500..599 -> println("Server Error")
        else -> println("Code not found")
    }

    val shoeSize = 40

    val message = when(shoeSize) {
        40,41 -> "We have shoes of this size"
        42,43 -> "We hardly have shoes of this size"
        44,45 -> "Sorry, We ran out of shoes"
        else -> "We don't have this size of shoes"
    }

    println(message)
}

fun variables() {
    println("Hello World!")

    // Variable - Write and read
    //var money: Int = 10
    var money = 10
    println(money)
    money = 5
    println(money)

    // Variable - Read only
    val name = "Anna"
    println(name)

    println(PI)

    //val boolean: Boolean = true
    val boolean = true;

    //val longNumber: Long = 3L
    val longNumber = 3L

    //val doubleNumber: Double = 2.1245
    val doubleNumber = 2.1245

    //val floatNumber: Float = 1.1f
    val floatNumber = 1.1f

    val firstValue = 20
    val secondValue = 10

    //val thirdValue = firstValue.minus(secondValue)
    val thirdValue = firstValue - secondValue

    println(thirdValue)

    val firstname = "Gustavo"
    val lastname = "Galvis"
    //val fullname = firstname + " " + lastname
    val fullname = "$firstname $lastname"

    println(fullname)
}

fun operations() {
    val a = 5
    val b = 3

    //var c = a.plus(b)
    var c = a + b

    //c = a.minus(b)
    c = a - b

    //c = a.times(b)
    c = a * b

    //c = a.div(b)
    c = a / b

    //c = a.rem(b)
    c = a % b

    //c = c.inc()
    c++

    //c = c.dec()
    c--

    //var d = a.compareTo(b) < 0
    var d = a < b

    //d = a.compareTo(b) == 0
    //d = a.equals(b)
    d = a == b

    //d = a.compareTo(b) > 0
    d = a > b

    //d = !a.equals(b)
    d = a != b
}

fun conditionalIf() {
    val name = "Andres"

    if (name.isNotEmpty()) println("The length of the name is ${name.length}") else println("Error: Name is empty")

    val message: String = if (name.length > 4) {
        "Your name is long!"
    } else if (name.isEmpty()) {
        "Name is empty"
    }else {
        "You have a short name"
    }

    println(message)
}