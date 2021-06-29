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
        readInt()
        var yes = false
        val x = readInts()
        for (i in x.indices) {
            if (i > 0) {
                if ((x[i] - x[i - 1]) and 1 == 0) {
                    yes = true
                    continue
                }
            }
        }
        if (yes) ans.append("YES\n") else ans.append("NO\n")
    }
    print(ans)
}