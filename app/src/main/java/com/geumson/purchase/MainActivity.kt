package com.geumson.purchase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geumson.purchase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with (binding) {
            btnOneTime.setOnClickListener {
                val intent = Intent(this@MainActivity, OneTimeActivity::class.java)
                startActivity(intent)
            }
            btnSubscription.setOnClickListener {
                val intent = Intent(this@MainActivity, SubscriptionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}