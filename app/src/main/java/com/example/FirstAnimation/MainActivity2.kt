package ru.btpitMedia.FirstAnimation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val roof: ImageView = findViewById(R.id.roof)
        val base: ImageView = findViewById(R.id.base)
        val window: ImageView = findViewById(R.id.window)
        val root_down = AnimationUtils.loadAnimation(this, R.anim.roof_down)
        val base_up = AnimationUtils.loadAnimation(this, R.anim.base_up)
        val win_left = AnimationUtils.loadAnimation(this, R.anim.window_left)
        roof.startAnimation(root_down)
        base.startAnimation(base_up)
        window.startAnimation(win_left)
    }
}
