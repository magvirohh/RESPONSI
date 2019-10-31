package com.uty.responsi5170411350

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Hobi = Hobi.text
        val nama = Edit_Nama.text
        val Umur = Umur.text
        val Email = Email.text
        val Username = Username.text
        val Jk= Jk.text

        prosses.setOnClickListener {
            intent = Intent(this,account::class.java)
            intent.putExtra("Hobi", Hobi)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai",Umur)
            intent.putExtra("Email", Email)
            intent.putExtra("Username", Username)
            intent.putExtra("jk",Jk)

        }
    }
}
