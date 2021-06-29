private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readPair() = readStrings().take(2)
private fun readIntPair() = readStrings().take(2).map { it.toInt() }


fun main(args: Array<String>) {
    println("Hello World!")
}