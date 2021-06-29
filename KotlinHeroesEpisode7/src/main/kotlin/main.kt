import java.lang.StringBuilder

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs


fun main(args: Array<String>) {
    uniformString()
}

private fun uniformString() {
    val tasksNumber = readInt()

    val sbAns = StringBuilder()
    for (i in 0 until tasksNumber) {
        val (length, lettersNumber) = readInts()
        val biggestLetterChar = ('a' + (lettersNumber - 1))
        var nextLetter = biggestLetterChar
        repeat(length) {
            sbAns.append(nextLetter)
            nextLetter = if (nextLetter > 'a') nextLetter - 1
            else biggestLetterChar
        }
        sbAns.append('\n')
    }
    print(sbAns)
}