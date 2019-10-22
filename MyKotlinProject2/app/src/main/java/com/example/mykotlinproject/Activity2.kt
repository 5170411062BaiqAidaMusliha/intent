package com.example.mykotlinproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Message
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent

class Activity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intent = intent
        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getIntExtra("Nilai", 0)
        val ket: String
        if (nilai >= 80) {
            ket = "A"
        } else if (nilai >= 60) {
            ket = "B"
        } else if (nilai >= 40) {
            ket = "C"
        } else if (nilai >= 20) {
            ket = "D"
        } else if (nilai <= 0) {
            ket = "E"
        } else {
            ket = "??"
        }

        val hasil =findViewById<TextView>(R.id.textView2)
        val Keterangan =findViewById<TextView>(R.id.textView3)
        hasil.text = "NIM:" + nim + "\nNama:" + nama + "\nNilai:" + nilai
        Keterangan.text ="Keterangan:" +ket
    }
}
