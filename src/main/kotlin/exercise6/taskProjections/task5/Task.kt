package exercise6.taskProjections.task5

/**
 * Task: Projections #5
 *
 * [1]
 * Create a new class "Printer", that can accept only T elements and print them
 *     - add a "print" function that prints item with type T;
 *
 * [2]
 * Create a new abstract class "Builder" that generates instances of T based on parameter of P type.
 * This class cannot produce P and consume T:
 *     - add an abstract "build" function that accepts P and returns T;
 * Create a new class "IntegerBuilder", that implements Builder and can convert String to Int
**/

class Printer<T>() {
    fun print(item : T) {
        println("$item")
    }
}

abstract class Builder<in P, out T>  {
    abstract fun build(item : P) : T
}

class IntegerBuilder() : Builder<String ,Int>() {
    override fun build(item : String) : Int {
        return item.toInt()
    }
}
fun main() {
    val integerPrinter = Printer<Int>()
    val stringPrinter = Printer<String>()

    integerPrinter.print(2)
    stringPrinter.print("Bla bla bla")

    println("________")

    val intBuilder = IntegerBuilder()
    val x = intBuilder.build("1")
    println("We build [ $x ]")
}
