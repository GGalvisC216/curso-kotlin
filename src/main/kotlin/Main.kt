// Constant
const val PI = 3.1416

fun main(args: Array<String>) {
    val lambdaWithIt: (String) -> Int = { it.length }
    val lambdaWithOwnValue: (String) -> Int = { value -> value.length }

    println(lambdaWithIt)

    val resultLambdaWithIt: Int = lambdaWithIt("Lambda With It")
    val resultLambdaWithOwnValue = lambdaWithOwnValue("Lambda String")
    println(resultLambdaWithIt)
    println(resultLambdaWithOwnValue)

    val greetings = listOf("Hello", "Hola", "Ciao")
    val lengthOfGreetings = greetings.map(lambdaWithIt)
    println(lengthOfGreetings)
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

fun conditionalWhen() {
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

fun whileLoop() {
    var counter = 10

    while (counter > 0) {
        println("The value is ${counter--}")
    }

    do {
        println("Generating random number")
        val randomNumber = (0..100).random()
        println("The number generated is $randomNumber")
    } while (randomNumber > 50)
}

fun forLoop() {
    val fruitList = listOf("Apple", "Pear", "Peach", "Raspberry")

    for (fruit in fruitList) println("The fruit of the day is $fruit")

    fruitList.forEach { fruit -> println("The fruit is $fruit") }

    val fruitCharacters = fruitList.map { fruit -> fruit.length }
    println(fruitCharacters)

    val filteredList = fruitCharacters.filter { fruitLength -> fruitLength > 5 }
    println(filteredList)
}

fun exceptions() {
    var name : String? = null

    println(name?.length)

    try {
        name!!.length
    } catch (exception: NullPointerException) {
        println("An error has ocurred")
    } finally {
        println("Finally an error has ocurred... Finishing app")
    }

    try {
        throw NullPointerException("Null reference")
    } catch (exception: NullPointerException) {
        println("Error: ${exception.message}")
    } finally {
        println("Closing app")
    }

    val firstValue = 5
    val secondValue = 0
    val result: Int = try { firstValue / secondValue } catch (exception: Exception) { 0 }
    println("Result: $result")
}

fun elvisOperator() {
    var name: String? = null
    val characters: Int = name?.length ?: 0
    println(characters)
}

fun lists() {
    // Immutable
    val nameList = listOf("John", "Anna", "Bob")
    println(nameList)

    // Mutable
    val emptyList = mutableListOf<String>()
    println(emptyList)

    emptyList.add("First Element")
    println(emptyList)

    val valueUsingGet = emptyList.get(0)
    println(valueUsingGet)

    val valueUsingOperator = emptyList[0]
    println(valueUsingOperator)

    //val firstValue = nameList.firstOrNull()
    val firstValue = nameList.first()
    println(firstValue)

    emptyList.removeAt(0)
    println(emptyList)

    emptyList.add("New Element")
    println(emptyList)
    emptyList.removeIf { element -> element.length > 5 }
    println(emptyList)

    // Arrays
    val array = arrayOf(1,2,3,4)
    println("Array $array")
    println("Array as List ${array.asList()}")
}

fun sorting() {
    val lotteryNumbers = listOf(11,22,7,66,32,43)

    val sortedNumbers = lotteryNumbers.sorted()
    println(sortedNumbers)

    val descSortedNumbers = lotteryNumbers.sortedDescending()
    println(descSortedNumbers)

    val orderedByMultiples = lotteryNumbers.sortedBy { number -> number < 30 }
    println(orderedByMultiples)

    val randomNumbers = lotteryNumbers.shuffled()
    println(randomNumbers)

    val reverseNumbers = lotteryNumbers.reversed()
    println(reverseNumbers)

    val messageNumbers = lotteryNumbers.map { number -> "Your lottery number is $number" }
    println(messageNumbers)

    val filteredNumbers = lotteryNumbers.filter { number -> number > 30 }
    println(filteredNumbers)
}

fun maps() {
    // Immutable
    val superHeroesAges = mapOf(
        "Ironman" to 35,
        "Spider-man" to 23,
        "Captain America" to 99
    )
    println(superHeroesAges)

    // Mutable
    val mutableSuperHeroesAges = mutableMapOf(
        "Ironman" to 35,
        "Spider-man" to 23,
        "Captain America" to 99
    )
    println(mutableSuperHeroesAges)

    // Using put method
    mutableSuperHeroesAges.put("Wolverine",45)
    println(mutableSuperHeroesAges)

    // Using assignment
    mutableSuperHeroesAges["Storm"] = 30
    println(mutableSuperHeroesAges)

    val ironmanAge = superHeroesAges["Ironman"]
    //val ironmanAge = mutableSuperHeroesAges["Ironman"]
    println(ironmanAge)

    mutableSuperHeroesAges.remove("Wolverine")
    println(mutableSuperHeroesAges)

    mutableSuperHeroesAges.replace("Storm", 27)
    println(mutableSuperHeroesAges)

    println(mutableSuperHeroesAges.keys)
    println(mutableSuperHeroesAges.values)
}

fun sets () {
    // Immutable
    val repeatedVowels = setOf("a","e","i","o","u","i","o","u")
    println(repeatedVowels)

    // Mutable
    val favoriteNumbers = mutableSetOf(1,2,3,4,5,5,4,3,2,1)
    println(favoriteNumbers)

    favoriteNumbers.add(5)
    println(favoriteNumbers)

    favoriteNumbers.add(10)
    favoriteNumbers.add(10)
    println(favoriteNumbers)

    favoriteNumbers.remove(5)
    println(favoriteNumbers)

    val setValue = favoriteNumbers.firstOrNull { number -> number > 11}
    println(setValue)
}

fun randomCase(phrase: String): String {
    val range = 0..99
    val randomNumber = range.random()

    return if (randomNumber.rem(2) == 0) {
        phrase.uppercase()
    } else {
        phrase.lowercase()
    }
}

fun printPhrase(phrase: String): Unit {
    println("Your phrase $phrase")
}

// Extension function
fun String.addLengthToPhrase(): String {
    return "$this with ${this.length} characters"
}

fun function() {
    val randomPhrase = "Learning Kotlin in Platzi"

    val result = randomCase(randomPhrase)
    println(result)

    println(randomCase(randomPhrase))

    printPhrase("This is a test")
    printPhrase(randomCase("This is a test"))

    val anotherPhrase = "Testing extension functions"
    println(anotherPhrase.addLengthToPhrase())
}

fun printName(firstname: String, secondName: String = "", lastname: String) {
    println("My full name is $firstname $secondName $lastname")
}

fun params() {
    printName("John", "","Smith")
    printName(firstname = "John", lastname = "Smith")
    printName(firstname = "Bob", secondName = "Rob", lastname = "Scott")
}