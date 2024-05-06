package com.example.android1homework61group

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android1homework61group.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val corrPassword = "123456789"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        safePassword()
    }

    private fun safePassword() = with(binding) {
        btnSeve.setOnClickListener {
            val accountPassword = etInput.text.toString()

            if (accountPassword == corrPassword) {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Неверный пвроль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}