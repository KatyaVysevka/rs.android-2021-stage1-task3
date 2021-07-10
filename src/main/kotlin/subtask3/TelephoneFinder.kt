package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
     //   throw NotImplementedError("Not implemented")
        var inputNumber = arrayOfNulls<String>(number.length)
        for ((index, value) in number.withIndex()) {
            inputNumber[index] = number[index].toString()
        }
        var  answerArray= arrayListOf<String>()
        for (i in inputNumber.indices){
            when (inputNumber[i]) {
                "0" -> {
                    inputNumber[i] = "8"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "0"
                }
                "1" -> {
                    inputNumber[i] = "2"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "4"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "1"
                }
                "2" -> {
                    inputNumber[i] = "1"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "3"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "5"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "2"
                }
                "3" -> {
                    inputNumber[i] = "2"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "6"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "3"
                }
                "4" -> {
                    inputNumber[i] = "1"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "5"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "7"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "4"
                }
                "5" -> {
                    inputNumber[i] = "2"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "4"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "6"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "8"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "5"
                }
                "6" -> {
                    inputNumber[i] = "3"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "5"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "9"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "6"
                }
                "7" -> {
                    inputNumber[i] = "4"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "8"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "7"
                }
                "8" -> {
                    inputNumber[i] = "5"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "7"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "9"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "0"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "8"
                }
                "9" -> {
                    inputNumber[i] = "6"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "8"
                    answerArray.add(inputNumber.joinToString (""))
                    inputNumber[i] = "9"
                }

            }
        }
        if (inputNumber[0] == "-") return null
        else return answerArray.toTypedArray()
    }


}
