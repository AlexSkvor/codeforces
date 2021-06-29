import kotlin.math.absoluteValue

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs


fun main(args: Array<String>) {
    taskName()
}

private fun taskName() {
    readInt()

    val studentsSorted = readInts().sorted().toMutableList()

    var ans = 0
    while (studentsSorted.isNotEmpty()) {
        val pair = studentsSorted.getMinDiffPair()
        ans += (studentsSorted[pair.first] - studentsSorted[pair.second]).absoluteValue
        studentsSorted.removeAt(pair.second)
        studentsSorted.removeAt(pair.first)
    }

    print(ans.toString())
}

private fun List<Int>.getMinDiffPair(): Pair<Int, Int> {
    var minDiff = 100
    var lastIndex = 0

    forEachIndexed { i, a ->
        if (i > 0) {
            if (this[i - 1] - a == 0) {
                return i - 1 to i
            } else {
                if (a - this[i - 1] < minDiff) {
                    lastIndex = i - 1
                    minDiff = this[i - 1] - a
                }
            }
        }
    }
    return lastIndex to (lastIndex + 1)
}