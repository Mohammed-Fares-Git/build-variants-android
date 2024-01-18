package com.mohammedfares.buildvariants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.BuildCompat
import com.mohammedfares.buildvariants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (BuildConfig.FREE && BuildConfig.DEBUG){
            binding.root.setBackgroundColor(getColor(R.color.black))
            binding.mainTextView.text = "this is free and debug"
        }

        if (BuildConfig.FREE && !BuildConfig.DEBUG){
            binding.root.setBackgroundColor(getColor(R.color.blue))
            binding.mainTextView.text = "this is free and release"
        }

        if (!BuildConfig.FREE && BuildConfig.DEBUG){
            binding.root.setBackgroundColor(getColor(R.color.green))
            binding.mainTextView.text = "this is paid and debug"
        }

        if (!BuildConfig.FREE && !BuildConfig.DEBUG){
            binding.root.setBackgroundColor(getColor(R.color.red))
            binding.mainTextView.text = "this is paid and release"
        }

    }
}