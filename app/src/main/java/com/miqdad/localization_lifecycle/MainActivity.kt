package com.miqdad.localization_lifecycle

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.miqdad.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private var _binding : ActivityMainBinding? = null
//    private val binding get() = _binding as ActivityMainBinding\
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.i("Activity", R.string.onCreate.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity", "onStart Invoke")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity", "onResume Invoke")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity", "onPause Invoke")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity", "onStop Invoke")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity", "onDestroy Invoke")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()

    }
}
