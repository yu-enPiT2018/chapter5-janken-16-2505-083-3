package com.example.enpit_p12.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        gu.setOnClickListener{onJankenBottonTapped(it)}
        choki.setOnClickListener{onJankenBottonTapped(it)}
        pa.setOnClickListener{onJankenBottonTapped(it)}

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
            val editor = pref.edit()
            editor.clear().apply()
    }

    fun onJankenBottonTapped(view: View?){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}
