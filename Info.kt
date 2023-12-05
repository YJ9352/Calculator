package com.example.myapplication.calculator_study

class Info(num1: Double, num2: Double, operator:String) {
    var num1: Double = num1
    var num2: Double = num2
    var operator: String = operator

    init {
        this.num1 = num1
        this.num2 = num2
        this.operator = operator
    }

    open fun endinfo() {
        println("입력된 수식은 ${num1} ${operator} ${num2} 입니다.")
    }

}