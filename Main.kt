package com.example.myapplication.calculator_study

fun main(args: Array<String>) {

    println("숫자를 입력해주세요.")
    var num1 = readLine()!!.toDouble()

    println("연산자를 넣어주세요(+, -, /, *)")
    val operator = readLine()!!.toString()

    println("숫자를 입력해주세요.")
    var num2 = readLine()!!.toDouble()

    var calculator = Calculator()
    var result = calculator.operator(num1, num2, operator)

    println("정답은 ${result}입니다.")
    Info(num1, num2, operator).endinfo()

}