package com.example.huita

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.TranslateAnimation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView : ImageView = findViewById( R.id.imageView)
        val translation = TranslateAnimation( fromXDelta= 0f, toXDetla=-1000f, fromYDelta=-1000f, toYDelta= 0f )
        translation.duration = 5000
        translation.interpolator = BounceInterpolator()
        imageView.startAnimation(translation)
    }
}