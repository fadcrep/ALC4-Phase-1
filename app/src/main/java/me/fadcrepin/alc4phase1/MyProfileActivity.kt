package me.fadcrepin.alc4phase1

import android.os.Bundle
import android.support.annotation.DrawableRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_my_profile.*

class MyProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = getString(R.string.My_Profile)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
