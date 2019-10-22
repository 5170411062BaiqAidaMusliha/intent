package com.example.mykotlinproject

import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NIM =findViewById<EditText>(R.id.editText2)
        val Nama =findViewById<EditText>(R.id.editText3)
        val Nilai =findViewById<EditText>(R.id.editText4)

        button.setOnClickListener {
            if ((editText2.text.isEmpty())||editText3.text.isEmpty()||editText4.text.isEmpty()){
                    toast("Kolom Tidak Boleh Kosong", Toast.LENGTH_LONG)
                }else{
                val nim = NIM.text.toString()
                val nama = Nama.text.toString()
                val nilai :Int = Integer.parseInt(Nilai.text.toString())
                val intent = Intent(this@MainActivity, Activity2::class.java)
                intent.putExtra("NIM", nim)
                intent.putExtra("Nama", nama)
                intent.putExtra("Nilai", nilai)

                startActivity(intent)
            }
        }
}

    fun toast(message: String, lengthLong:Int=Toast.LENGTH_LONG) {
        Toast.makeText(this, message, lengthLong).show()
    }
}

