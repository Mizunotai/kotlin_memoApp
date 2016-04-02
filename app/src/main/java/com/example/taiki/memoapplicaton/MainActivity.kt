package com.example.taiki.memoapplicaton

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var pref1: SharedPreferences? = null
    //    var edit: SharedPreferences.Editor? = null
    var textView: TextView? = null
    var button :Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView) as TextView

        button = findViewById(R.id.button) as Button

        pref1 = getSharedPreferences("KEY", MODE_PRIVATE)

        var texts: String = pref1?.getString("SAVE", "").toString()

        Log.e("main_1", texts)

        textView?.text = texts




        button?.setOnClickListener {


            var intent = Intent(applicationContext, Main2Activity::class.java)
            startActivity(intent)

        }
    }

    override fun onResume() {
        super.onResume()

        var texts: String = pref1?.getString("SAVE", "").toString()

        Log.e("main_1", texts)

        textView?.text = texts

    }


}
