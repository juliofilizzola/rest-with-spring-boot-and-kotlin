package br.com.erudio.service

import br.com.erudio.convert.ConvertNumber
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
        if (!ConvertNumber().isNumeric(numberOne) || !ConvertNumber().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return ConvertNumber().convertToDouble(numberOne) + ConvertNumber().convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun sub(numberOne: String, numberTwo: String): Double {
        if (!ConvertNumber().isNumeric(numberOne) || !ConvertNumber().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return ConvertNumber().convertToDouble(numberOne) - ConvertNumber().convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun multiplication(numberOne: String, numberTwo: String): Double {
        if (!ConvertNumber().isNumeric(numberOne) || !ConvertNumber().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return ConvertNumber().convertToDouble(numberOne) * ConvertNumber().convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun division(numberOne: String, numberTwo: String): Double {
        if (!ConvertNumber().isNumeric(numberOne) || !ConvertNumber().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return ConvertNumber().convertToDouble(numberOne) / ConvertNumber().convertToDouble(numberTwo)
    }

    /**
    @param NumberOne: value numeric
    @param NumberTwo: value numeric

    @return double
     */
    fun rest(numberOne: String, numberTwo: String): Double {
        if (!ConvertNumber().isNumeric(numberOne) || !ConvertNumber().isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return ConvertNumber().convertToDouble(numberOne) + ConvertNumber().convertToDouble(numberTwo) / 2
    }

    /**
    @param number: value numeric

    @return double
     */
    fun squareRoot(number: String): Double {
        if (!ConvertNumber().isNumeric(number)) {
            throw UnsupportedMathOperationException("Please set a number")
        }

        return sqrt(ConvertNumber().convertToDouble(number))
    }


}