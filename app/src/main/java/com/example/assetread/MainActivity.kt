package com.example.assetread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Calling my read Function
        val data = readFromAsset()
        txt = findViewById<TextView>(R.id.myAsset)
        txt.text = data

    }

    //My function to read Json file
    private fun readFromAsset(): String {
        val file_name = "Mine.Json"
        val bufferReader = application.assets.open(file_name).bufferedReader()
        val data = bufferReader.use {
            it.readText()
        }


        return data;
    }
}