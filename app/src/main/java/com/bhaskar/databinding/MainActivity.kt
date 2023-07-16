package com.bhaskar.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bhaskar.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var quote : Quote
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val quote = Quote("Jyoti", "Bhaskar")

        binding.quote = quote

    }

}