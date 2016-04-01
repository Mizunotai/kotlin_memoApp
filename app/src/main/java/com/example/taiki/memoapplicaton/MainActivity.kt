package com.example.taiki.memoapplicaton

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var pref: SharedPreferences? = null
//    var edit: SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.textView) as TextView

        var button: Button = findViewById(R.id.textView) as Button

        textView.text = pref?.getString("SAVE",toString())

        button.setOnClickListener {


            var intent = Intent(applicationContext, Main2Activity::class.java)
            startActivity(intent)

        }


    }
}
