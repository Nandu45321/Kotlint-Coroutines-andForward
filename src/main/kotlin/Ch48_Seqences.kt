fun main() {

    val numbers = sequenceOf(1, 2, 3)
    println(numbers.toList())

    val numbers2 = listOf(1, 2, 3).asSequence()
    println(numbers2.toList())

    val result = numbers
        .filter {
            it % 2 == 0
        }.map {
            it * it
        }

}