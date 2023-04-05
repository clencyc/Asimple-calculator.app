package com.example.simple_clencycalcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_display_answer:TextView
    private lateinit var edTFirst:EditText
    private lateinit var edTsecond:EditText
    private lateinit var addbutton:Button
    private lateinit var multiply_btn:Button
    private lateinit var divide_btn:Button
    private lateinit var subtract_btn:Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_display_answer = findViewById(R.id.txtdisplay)
        edTFirst = findViewById(R.id.edtfirst)
        edTsecond = findViewById(R.id.edtsecond)
        addbutton = findViewById(R.id.btnadd)
        multiply_btn = findViewById(R.id.btnmultiply)
        divide_btn = findViewById(R.id.btndivide)
        subtract_btn = findViewById(R.id.btnsubtract)

        addbutton.setOnClickListener {
            var first_num = edTFirst.text.toString().trim()
            var second_num = edTsecond.text.toString().trim()
            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var answer = first_num.toDouble() + second_num.toDouble()
                txt_display_answer.text = answer.toString()

                //Toast.makeText(this, "Trying to add two numbers", Toast.LENGTH_SHORT).show()
            }




            //Toast.makeText(this, "Trying to add", Toast.LENGTH_SHORT).show()
        }

        multiply_btn.setOnClickListener {
            var num1 = edTFirst.text.toString().trim()
            var num2 = edTsecond.text.toString().trim()

            //user validation
            if (num1.isEmpty() || num2.isEmpty()){
                Toast.makeText(this, "Please  enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var answer1 = num1.toDouble() * num2.toDouble()
                txt_display_answer.text = answer1.toString()

                //Toast.makeText(this, "Trying to multiply two numbers", Toast.LENGTH_SHORT).show()
            }
        }

        divide_btn.setOnClickListener {
            var number1 = edTFirst.text.toString().trim()
            var number2 = edTsecond.text.toString().trim()

            //user validation
            if (number1.isEmpty() || number2.isEmpty()){
                Toast.makeText(this, "Please Enter a number", Toast.LENGTH_SHORT).show()

            }
            else{
                var answer2 = number1.toDouble() / number2.toDouble()
                txt_display_answer.text = answer2.toString()

                //Toast.makeText(this, "Trying to divide a number", Toast.LENGTH_SHORT).show()
            }
        }

        subtract_btn.setOnClickListener {
            var num_1 = edTFirst.text.toString().trim()
            var num_2 = edTsecond.text.toString().trim()

            //user validation
            if (num_1.isEmpty() || num_2.isEmpty()){
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var answer3 = num_1.toDouble() - num_2.toDouble()
                txt_display_answer.text = answer3.toString()
                //Toast.makeText(this, "Trying to subtract a number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}