package br.com.erudio

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {
    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String,
        @PathVariable(value = "numberTwo") numberTwo: String
    ): Double {
        return MathService().sum(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/sub/{numberOne}/{numberTwo}"])
    fun sub(
        @PathVariable(value = "numberOne") numberOne: String,
        @PathVariable(value = "numberTwo") numberTwo: String
    ): Double {
        return MathService().sub(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(
        @PathVariable(value = "numberOne") numberOne: String,
        @PathVariable(value = "numberTwo") numberTwo: String
    ): Double {
        return MathService().multiplication(numberOne, numberTwo)
    }


    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(
        @PathVariable(value = "numberOne") numberOne: String,
        @PathVariable(value = "numberTwo") numberTwo: String
    ): Double {
        return MathService().division(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/rest/{numberOne}/{numberTwo}"])
    fun rest(
        @PathVariable(value = "numberOne") numberOne: String,
        @PathVariable(value = "numberTwo") numberTwo: String
    ): Double {
        return MathService().rest(numberOne, numberTwo)
    }

    @RequestMapping(value = ["/squareRoot/{number}"])
    fun squareRoot(
        @PathVariable(value = "number") number: String
    ): Double {
        return MathService().squareRoot(number)
    }

}