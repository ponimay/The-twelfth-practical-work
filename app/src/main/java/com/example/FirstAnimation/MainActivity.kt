package ru.btpitMedia.FirstAnimation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        val imageView: ImageView = findViewById(R.id.sun)
        val imageView1: ImageView = findViewById(R.id.clock)
        val imageView2: ImageView = findViewById(R.id.hour_hand)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val hour: Animation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
        imageView2.startAnimation(hour)
        val clock: Animation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        imageView1.startAnimation(clock)
        val syn: Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        imageView.startAnimation(syn)
    }
}