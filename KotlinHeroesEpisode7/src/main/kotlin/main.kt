import java.lang.StringBuilder

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs


fun main(args: Array<String>) {
    jumpingFrogs()
}

private fun jumpingFrogs() {
    val n = readInt()

    val ans = StringBuilder()
    for (i in 0 until n) {
        val (a, b, k) = readLongs()
        val rightJumps = k / 2 + k % 2
        val leftJumps = k / 2
        val currentAns = rightJumps * a - leftJumps * b
        ans.append(currentAns.toString() + '\n')
    }
    print(ans)

}