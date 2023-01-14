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