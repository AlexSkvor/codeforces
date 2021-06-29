import java.lang.StringBuilder

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs


fun main(args: Array<String>) {
    taskName()
}

private fun taskName() {
    val tasksNumber = readInt()

    val ans = StringBuilder()
    repeat(tasksNumber) { taskNumber ->
        val (sweetNumber, step) = readInts()
        val loves = readLn().toList().map { it == '1' } // true -> loves
        val sweets = BooleanArray(sweetNumber) // false -> not eaten!

        var lovesCount = loves.count { it }

        if (lovesCount > 0) {

            var lastEatenIndex = 0
            var sweetsEaten = 1
            sweets[0] = true
            if (loves[0]) lovesCount--

            while (lovesCount > 0) {
                var stepCounter = 0
                var index = lastEatenIndex
                while (stepCounter < step) {
                    if (!sweets[(index + 1) % sweets.size]) {
                        index++
                        stepCounter++
                    } else {
                        index++
                    }
                }
                if (loves[index % sweets.size]) {
                    lovesCount--
                }
                sweetsEaten++
                sweets[index % sweets.size] = true
                lastEatenIndex = index
            }
            ans.append(sweetsEaten.toString() + "\n")
        } else {
            ans.append("0\n")
        }
    }
    print(ans)
}