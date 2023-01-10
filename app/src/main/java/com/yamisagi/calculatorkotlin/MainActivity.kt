package com.yamisagi.calculatorkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var number1: Int? = 0
    var number2: Int? = 0
    var result: Int? = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    @SuppressLint("SetTextI18n")
    fun sum(view: View) {
        print("sum")
        number1 = findViewById<TextView>(R.id.num1).text.toString().toIntOrNull()
        number2 = findViewById<TextView>(R.id.num2).text.toString().toIntOrNull()


        if (number1 != null && number2 != null) {
            result = number1!! + number2!!
            findViewById<TextView>(R.id.resultText).text = result.toString()

        } else {
            findViewById<TextView>(R.id.resultText).text = "Error"
        }

    }

    @SuppressLint("SetTextI18n")
    fun min(view: View) {
        number1 = findViewById<TextView>(R.id.num1).text.toString().toIntOrNull()
        number2 = findViewById<TextView>(R.id.num2).text.toString().toIntOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! - number2!!
            findViewById<TextView>(R.id.resultText).text = result.toString()

        } else {
            findViewById<TextView>(R.id.resultText).text = "Error"
        }
    }

    @SuppressLint("SetTextI18n")
    fun multiply(view: View) {
        number1 = findViewById<TextView>(R.id.num1).text.toString().toIntOrNull()
        number2 = findViewById<TextView>(R.id.num2).text.toString().toIntOrNull()

        if (number1 != null && number2 != null) {
            result = number1!! * number2!!
            findViewById<TextView>(R.id.resultText).text = result.toString()

        } else {
            findViewById<TextView>(R.id.resultText).text = "Error"
        }
    }

    @SuppressLint("SetTextI18n")
    fun divide(view: View) {
        number1 = findViewById<TextView>(R.id.num1).text.toString().toIntOrNull()
        number2 = findViewById<TextView>(R.id.num2).text.toString().toIntOrNull()

       try {
           if (number1 != null && number2 != null) {
               result = number1!! / number2!!
               findViewById<TextView>(R.id.resultText).text = result.toString()

           } else {
               findViewById<TextView>(R.id.resultText).text = "Error"
           }
       }catch (e: ArithmeticException){
           findViewById<TextView>(R.id.resultText).text = "Divide by zero not allowed"       }
    }


}

