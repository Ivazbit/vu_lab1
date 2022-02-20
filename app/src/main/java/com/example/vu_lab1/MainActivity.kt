package com.example.vu_lab1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleButton = findViewById<Button>(R.id.simple_button)
        val colorButton = findViewById<Button>(R.id.color_button)
        val textView = findViewById<TextView>(R.id.text_view)

        var simpleClicked = false
        var colorClicked = false

        simpleButton.setOnClickListener {
            simpleClicked = if (!simpleClicked) {
                textView.setText(R.string.hello_world_lt)
                true
            } else {
                textView.setText(R.string.hello_world)
                false
            }
        }

        colorButton.setOnClickListener {
            colorClicked = if (!colorClicked) {
                textView.setTextColor(Color.CYAN)
                true
            } else {
                textView.setTextColor(Color.MAGENTA)
                false
            }
        }
    }
}