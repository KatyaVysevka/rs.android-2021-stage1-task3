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

    fun factorial(num: Int): Int {
        var answer = 1
        for (i in 1..num) {
            answer *= i
        }
        return answer
    }
}