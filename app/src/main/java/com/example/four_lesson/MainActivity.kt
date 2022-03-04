package com.example.four_lesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.four_lesson.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener {
            var user = User(id = 20, name= "Jafar")
            openDetailActivity(user)
        }
    }

    fun openDetailActivity(user:User) {
        val intent = Intent(this, DetailActivity::class.java)
        val putExtra = intent.putExtra("user", user)
        startActivity(intent)
    }
}