package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var etamount: EditText
    private lateinit var btnenter:Button
    private lateinit var tvresult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         etamount=findViewById(R.id.editText)
         btnenter=findViewById(R.id.button)
         tvresult=findViewById(R.id.textView)
        btnenter.setOnClickListener {
            val enteramount=etamount.text.toString()
            if (enteramount.isNotEmpty()){
                val amount=enteramount.toDouble()
                val tip=amount*0.1
                tvresult.text="$tip"
            }else{
                tvresult.text="Please enter the amount"
            }





        }

    }

}