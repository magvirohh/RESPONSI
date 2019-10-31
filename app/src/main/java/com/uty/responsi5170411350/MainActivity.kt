package com.uty.responsi5170411350

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_register.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: AbsListView.RecyclerListener
    private var list: ArrayList<carditem> = arrayListOf()
    val languages = listOf("Sayur asem", "Bakso", "Bakwan", "Burger", "Crab", "Mie", "Nasi goreng", "Pempek", "Rendang", "Sosis")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_heroes)

        list.addAll(detail.listItem)
        showRecyclerCardView()

        btn1.setOnClickListener {
            val intent = Intent(this,detail::class.java)
            startActivity(intent)
            finish()
        }
        btn.setOnClickListener {
            val Username1 = Username.text.toString()
            val Password1 = Password.text.toString()
            if (Username1.isEmpty() || Password1.isEmpty()) {
                Toast.makeText(this, "Username atau password anda salah", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (Username1 == "vivi" || Password1 == "vivi") {
                val progressDialog = ProgressDialog(this, R.style.Theme_AppCompat_Light_Dialog)
                progressDialog.setMessage("benar")
                progressDialog.show()
                val intent = Intent(this, detail::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
        private fun showRecyclerCardView() {
            rvHeroes.layoutManager = RelativeLayout(this)
            val cardViewHeroAdapter = cardviewadapter(list)
            rvHeroes.adapter = cardViewHeroAdapter
        }
        list_view.adapter = ArrayAdapter(this, simple_list_item_1, languages)
}

