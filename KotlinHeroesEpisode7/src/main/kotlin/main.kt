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
        val (friendsNumber, startDay) = readInts()
        var max = 0
        repeat(friendsNumber) { friendNumber ->
            val (fromDay, toDay) = readInts()
            if (startDay in fromDay..toDay) {
                val interval = toDay - startDay + 1
                if (interval > max) {
                    max = interval
                }
            }
        }
        ans.append("$max\n")
    }
    print(ans)
}