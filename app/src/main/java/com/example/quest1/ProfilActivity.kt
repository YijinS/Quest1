package com.example.quest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val name = intent.getStringExtra("name")
        val birth = intent.getStringExtra("birth")
        val nic = intent.getStringExtra("nic")

        nameTxt.text = name
        bdTxt.text = birth
        nicTxt.text = nic

    }
}