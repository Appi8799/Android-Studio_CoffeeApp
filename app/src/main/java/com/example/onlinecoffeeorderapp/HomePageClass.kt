package com.example.onlinecoffeeorderapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class HomePageClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage_layout)



        var countinuebtn = findViewById<View>(R.id.btnContinue) as Button
        var btnOpt1 = findViewById<View>(R.id.btnOpt1) as Button
        var btnOpt2 = findViewById<View>(R.id.btnOpt2) as Button
        var btnOpt3 = findViewById<View>(R.id.btnOpt3) as Button
        var btnOpt4 = findViewById<View>(R.id.btnOpt4) as Button
        var txtSizeView = findViewById<View>(R.id.txtSizeView) as TextView
        var radioBtn = findViewById<View>(R.id.btnRadioGrp) as RadioGroup
        var radioBtn1 = findViewById<View>(R.id.rdbtn1) as RadioButton
        var radioBtn2 = findViewById<View>(R.id.rdbtn2) as RadioButton
        var radioBtn3 = findViewById<View>(R.id.rdbtn3) as RadioButton
        var txtOptions = findViewById<View>(R.id.txtOptionsView) as TextView
        var checkBox1 = findViewById<View>(R.id.chbx1) as CheckBox
        var checkBox2 = findViewById<View>(R.id.chbx2) as CheckBox
        var checkBox3 = findViewById<View>(R.id.chbx3) as CheckBox
        var checkBox4 = findViewById<View>(R.id.chbx4) as CheckBox
        var checkBox5 = findViewById<View>(R.id.chbx5) as CheckBox
        var checkBox6 = findViewById<View>(R.id.chbx6) as CheckBox
        var checkBox7 = findViewById<View>(R.id.chbx7) as CheckBox


        fun hideElements(){
            countinuebtn.setEnabled(false)
            txtSizeView.isVisible = false
            radioBtn.isVisible = false
            txtOptions.isVisible = false
            checkBox1.isVisible = false
            checkBox2.isVisible = false
            checkBox3.isVisible = false
            checkBox4.isVisible = false
            checkBox5.isVisible = false
            checkBox6.isVisible = false
            checkBox7.isVisible = false
        }
        fun elementsVisibility() {
            txtSizeView.isVisible = true
            radioBtn.isVisible = true

            if (radioBtn1.isChecked || radioBtn2.isChecked || radioBtn3.isChecked) {
                txtOptions.isVisible = true
                checkBox1.isVisible = true
                checkBox2.isVisible = true
                checkBox3.isVisible = true
                checkBox4.isVisible = true
                checkBox5.isVisible = true
                checkBox6.isVisible = true
                checkBox7.isVisible = true

                if (checkBox1.isChecked ||  checkBox2.isChecked || checkBox3.isChecked || checkBox4.isChecked || checkBox5.isChecked || checkBox6.isChecked || checkBox7.isChecked) {
                    countinuebtn.setEnabled(true)
                } else {
                    countinuebtn.setEnabled(false)
                }
            }
        }

        hideElements()

        btnOpt1.setOnClickListener{
            if (btnOpt1.isSelected) {
                btnOpt1.setBackgroundColor(Color.BLACK)
                elementsVisibility()
            }else {
                hideElements()
            }
        }

        btnOpt2.setOnClickListener {
            if (btnOpt2.isSelected) {
                btnOpt2.setBackgroundColor(Color.BLACK)
                elementsVisibility()
            }else {
                hideElements()
            }
        }

        btnOpt3.setOnClickListener {
            if (btnOpt3.isSelected) {
                btnOpt3.setBackgroundColor(Color.BLACK)
                elementsVisibility()
            }else {
                hideElements()
            }
        }

        btnOpt4.setOnClickListener {
            if (btnOpt4.isSelected) {
                btnOpt4.setBackgroundColor(Color.BLACK)
                elementsVisibility()
            }else {
                hideElements()
            }
        }

        countinuebtn.setOnClickListener {
            //creating intent to set the string values of all editTextView
            val i = Intent(this, PaymentClass::class.java)

            startActivity(i)
        }
    }




}



