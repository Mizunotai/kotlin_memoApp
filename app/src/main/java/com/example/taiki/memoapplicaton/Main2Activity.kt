package com.example.taiki.memoapplicaton

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Main2Activity : AppCompatActivity() {

    var pref: SharedPreferences? = null
    var edit: SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editText :EditText = findViewById(R.id.editText) as EditText
        var button2 :Button = findViewById(R.id.button2) as Button

        pref = getSharedPreferences("KEY", MODE_PRIVATE)
        edit = pref?.edit()


        button2.setOnClickListener {
            var memoText: String = editText.text.toString()

            edit?.putString("SAVE",memoText)
            edit?.commit()

            finish()
        }
    }
}
