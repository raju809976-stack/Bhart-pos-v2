package com.example.bharatpos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bharatpos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.titleText.text = getString(R.string.app_name)
    }
}
