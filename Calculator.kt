package com.example.myapplication.calculator_study

class Calculator() {
    fun operator(num1: Double, num2: Double, operator: String) : Double {
        var add = AddOperation()
        var sub = SubstractOperation()
        var mul = MultiplyOperation()
        var divi = DivideOperation()

        var result = 0.0

        if( operator == "+") {
            result = add.operate(num1, num2)
        } else if( operator == "-") {
            result = sub.operate(num1, num2)
        } else if( operator == "*") {
            result = mul.operate(num1, num2)
        } else if( operator == "/") {
            result = divi.operate(num1, num2)
        } else {
            println("선택이 취소되었습니다.")
            0.0
        }
        return result
    }
}
