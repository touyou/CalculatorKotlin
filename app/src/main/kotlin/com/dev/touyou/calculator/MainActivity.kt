package com.dev.touyou.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num1View: TextView? = null
    var opeView: TextView? = null
    var num2View: TextView? = null
    var answerView: TextView? = null

    var num1: Int = 0
    var num2: Int = 0
    var ope: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1View = findViewById(R.id.num1) as TextView
        opeView = findViewById(R.id.ope) as TextView
        num2View = findViewById(R.id.num2) as TextView
        answerView = findViewById(R.id.answer) as TextView

        num1View?.setText("0")
        opeView?.setText("")
        num2View?.setText("")
        answerView?.setText("")
    }

    // button
    fun btnum(num: Int) {
        when(ope) {
            0 -> {
                num1 = num1 * 10 + num
                num1View?.setText("${num1}")
            }
            1, 2, 3, 4 -> {
                num2 = num2 * 10 + num
                num2View?.setText("${num2}")
            }
        }
    }
    fun bt1(v: View) {
        btnum(1)
    }
    fun bt2(v: View) {
        btnum(2)
    }
    fun bt3(v: View) {
        btnum(3)
    }
    fun bt4(v: View) {
        btnum(4)
    }
    fun bt5(v: View) {
        btnum(5)
    }
    fun bt6(v: View) {
        btnum(6)
    }
    fun bt7(v: View) {
        btnum(7)
    }
    fun bt8(v: View) {
        btnum(8)
    }
    fun bt9(v: View) {
        btnum(9)
    }
    fun bt0(v: View) {
        btnum(0)
    }

    fun btplus(v: View) {
        opeView?.setText("+")
        ope = 1
    }
    fun btminus(v: View) {
        opeView?.setText("-")
        ope = 2
    }
    fun bttimes(v: View) {
        opeView?.setText("*")
        ope = 3
    }
    fun btdivide(v: View) {
        opeView?.setText("/")
        ope = 4
    }

    fun btequal(v: View) {
        when(ope) {
            1 -> answerView?.setText("=${num1 + num2}")
            2 -> answerView?.setText("=${num1 - num2}")
            3 -> answerView?.setText("=${num1 * num2}")
            4 -> {
                if (num2 == 0) {
                    answerView?.setText("=error")
                } else {
                    answerView?.setText("=${num1 / num2}")
                }
            }
        }
        ope = -1
    }

    fun btclear(v: View) {
        num1View?.setText("0")
        opeView?.setText("")
        num2View?.setText("")
        answerView?.setText("")
        num1 = 0
        num2 = 0
        ope = 0
    }
}
