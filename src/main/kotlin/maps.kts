fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
        "Ann" to 56
    )
    peopleAges.put("Barbara",42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    val filteredNames = peopleAges.filter {it.key.length < 4}
}