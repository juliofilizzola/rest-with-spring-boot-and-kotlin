package br.com.erudio

import br.com.erudio.exceptions.UnsupportedMathOperationException
import org.springframework.stereotype.Service
import kotlin.math.sqrt

@Service
class MathService {
    /**
     @param NumberOne: value numeric
     @param NumberTwo: value numeric

     @return double
    */
    fun sum(numberOne: String, numberTwo: String): Double {
        if (!MathService().isNumeric(numberOne) || !MathService().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun sub(numberOne: String, numberTwo: String): Double {
        if (!MathService().isNumeric(numberOne) || !MathService().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return convertToDouble(numberOne) - convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun multiplication(numberOne: String, numberTwo: String): Double {
        if (!MathService().isNumeric(numberOne) || !MathService().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return convertToDouble(numberOne) * convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun division(numberOne: String, numberTwo: String): Double {
        if (!MathService().isNumeric(numberOne) || !MathService().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun rest(numberOne: String, numberTwo: String): Double {
        if (!MathService().isNumeric(numberOne) || !MathService().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo) / 2
    }

    /**
    @param number: value numeric

    @return double
     */
    fun squareRoot(number: String): Double {
        if (!MathService().isNumeric(number)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return sqrt(convertToDouble(number))
    }

    private fun convertToDouble(strNumber: String?): Double {
        if (strNumber.isNullOrBlank()) return 0.0
        val number = strNumber.replace(",".toRegex(), ".")
        return if (isNumeric(number)) number.toDouble() else 0.0
    }

    private fun isNumeric(strNumber: String?): Boolean {
        if (strNumber.isNullOrBlank()) return false
        val number = strNumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}