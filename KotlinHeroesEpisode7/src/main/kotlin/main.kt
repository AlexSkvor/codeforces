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
    for (i in 0 until tasksNumber) {

    }
    print(ans)
}