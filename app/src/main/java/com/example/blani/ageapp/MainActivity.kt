package com.example.blani.ageapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR);
        var age = currentYear - inputYear.text.toString().toInt();


        if(age < 0){
            tvAge.text = "Ups! It seems you have not been born yet! ";
        }
        else if( age < 18){
            tvAge.text = "Dear! You are too young! You are just: " + age + "!";
        }
        else if(age > 130){
            tvAge.text = "Stop it! It is unpossible to live so long!";
        }
        else{
            tvAge.text = "Your age is: " + age + ". Welcome!";
        }
    }
}
