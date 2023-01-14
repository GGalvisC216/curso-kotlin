// Constant
const val PI = 3.1416

fun main(args: Array<String>) {
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