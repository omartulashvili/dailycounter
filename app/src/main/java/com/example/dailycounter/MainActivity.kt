package com.example.dailycounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 0
        set(value) {
            field = value
            waterValue.text = value.toString()
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        waterSubtract.setOnClickListener {
                counter--
                waterValue.text = counter.toString()
            }

        waterAdd.setOnClickListener {
                counter++
                waterValue.text = counter.toString()
            }


        waterStepAdd.setOnClickListener {
            counter += 10
            waterValue.text = counter.toString()
            }

        waterStepSubtract.setOnClickListener {
            counter -= 10
            waterValue.text = counter.toString()
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("COUNT_KEY", counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counter = savedInstanceState.getInt("COUNT_KEY")
    }


}
