package com.example.taiki.memoapplicaton

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Main2Activity : AppCompatActivity() {

    var pref: SharedPreferences? = null
    var edit: SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editText :EditText = findViewById(R.id.editText) as EditText
        var button :Button = findViewById(R.id.button) as Button

        pref = getSharedPreferences("KEY", MODE_PRIVATE)
        edit = pref?.edit()


        button.setOnClickListener {
            var memoText: String = editText.text.toString()

            edit?.putString("SAVE",memoText)
            edit?.commit()

            finish()
        }



    }
}
