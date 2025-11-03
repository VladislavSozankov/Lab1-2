package com.example.lab1_2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        val editText = findViewById<TextInputEditText>(R.id.textInputEditText)
        val textView = findViewById<TextView>(R.id.textView)

        textView.text = editText.text
        editText.setText("")
    }
}