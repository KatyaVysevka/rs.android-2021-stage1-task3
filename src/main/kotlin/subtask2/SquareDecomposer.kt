package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
     // throw NotImplementedError("Not implemented")
        return if (number < 4) null
        else downTo(kvadr(number), number - 1)?.toTypedArray()
    }

    private fun downTo(number: Int, position: Int): ArrayList<Int>? {
        for (i in position downTo 1) {
            val perem = raznKvadr(number, i)
            if (perem == 0) return arrayListOf(i)
            if (perem < 0) return null
            var root = sqrt(perem.toDouble()).toInt()
            if (root >= i) root = i - 1
            val result = downTo(perem, root)
            if (result != null) {
                result.add(i)
                return result
            }
        }
        return null
    }

    private fun kvadr(x: Int) = x * x
    private fun raznKvadr(a: Int, b: Int) = a - kvadr(b)
}
