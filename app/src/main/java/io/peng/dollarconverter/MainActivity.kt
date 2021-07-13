package io.peng.dollarconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.peng.dollarconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun convertCurrency(view: View){
        val dollarValue = binding.dollarText.text.toString().toFloat()
        val euroValue = dollarValue * 0.85f

        if (binding.dollarText.toString().isNotEmpty()){

            binding.textView.text = euroValue.toString()
        }
        else{
            binding.textView.text = getString(R.string.no_value_string)
        }
    }
}