package com.example.four_lesson

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.four_lesson.R.id.tv_detail

class DetailActivity : AppCompatActivity() {
       var TAG = DetailActivity::class.java.toString()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            initViews()
        }

         fun initViews() {
            val tv_detail = findViewById<TextView>(tv_detail)
            var user = intent.getSerializableExtra("user")
            Log.d(TAG,user.toString())

            tv_detail.text = user.toString()

        }
    }
