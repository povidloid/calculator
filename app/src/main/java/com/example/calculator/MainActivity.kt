package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.math.log
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var fNum: Double = 0.0
    private var sNum: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bPlus.setOnClickListener {
            getNumbers()
            binding.twResult.text = (fNum + sNum).toString()
        }
        binding.bMinus.setOnClickListener {
            getNumbers()
            binding.twResult.text = (fNum - sNum).toString()
        }
        binding.bMultiply.setOnClickListener {
            getNumbers()
            binding.twResult.text = (fNum * sNum).toString()
        }
        binding.bDivision.setOnClickListener {
            getNumbers()
            val result = fNum/sNum
            binding.twResult.text = result.toString()
        }
        binding.bPow.setOnClickListener {
            getNumbers()
            binding.twResult.text = fNum.pow(sNum).toString()
        }
        binding.bSqrt.setOnClickListener {
            binding.twResult.text = sqrt(fNum).toString()
        }
        binding.bRounding.setOnClickListener {
            getNumbers()
            binding.twResult.text = round(fNum).toString()
        }
        binding.bPercent.setOnClickListener {
            getNumbers()
            binding.twResult.text = (fNum * sNum / 100).toString()
        }
        binding.bLog.setOnClickListener {
            getNumbers()
            binding.twResult.text = log(fNum, sNum).toString()
        }
    }

    private fun getNumbers(){
        fNum = binding.editFNum.text.toString().toDouble()
        sNum = binding.editSNum.text.toString().toDouble()
    }
}