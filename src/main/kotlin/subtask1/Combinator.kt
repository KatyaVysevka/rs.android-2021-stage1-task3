package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        //  throw NotImplementedError("Not implemented")
        val m = array[0]
        val n = array[1]
        for (i in 0..n) {
            if (factorial(n) == m * factorial(n - i) * factorial(i))
                return i
        }
        return null
    }

    fun factorial(n: Int): Int = if (n < 2) 1 else n * factorial(n -1)

}