package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //  enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Dapatkan value yang dimasukkan oleh user dalam num1EditText

        val num1 = binding.num1EditText.text
        val num2 = binding.num2EditText.text

        // Bila button + ditekan lakukan kod di dalam ini

        binding.plusBtn.setOnClickListener {
            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.resultTextView.text = "The sum of $num1 and $num2 is $sum"

        }
        // Bila button - ditekan lakukan kod di dalam ini

        binding.minusBtn.setOnClickListener {
            val minus = num1.toString().toDouble() - num2.toString().toDouble()
            binding.resultTextView.text = "$num1 minus $num2 is $minus"
        }

        // Bila button / ditekan lakukan kod di dalam ini
        binding.divideBtn.setOnClickListener {
            val division = num1.toString().toDouble() / num2.toString().toDouble()
            binding.resultTextView.text = "THe division of $num1 and $num2 is $division"
        }

        // Bila button x ditekan lakukan kod di dalam ini

        // Listener -> Wait for / Dengar ...
        // onClick -> Click to happen on this button
        // Built in method on button

        binding.productBtn.setOnClickListener {
            val product = num1.toString().toDouble() * num2.toString().toDouble()
            binding.resultTextView.text = "THe product of $num1 and $num2 is $product"
        }
    }
}