package com.acrony.kotlinradiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rdGenders=findViewById<RadioGroup>(R.id.rgGender)

        rdGenders?.setOnCheckedChangeListener{_,checkedId->

            var selectedGender="Your Gender is: "

            selectedGender+=if(R.id.rbMale==checkedId) "Male" else "Female"

            Toast.makeText(applicationContext,selectedGender,Toast.LENGTH_LONG).show()


        }
    }
}
