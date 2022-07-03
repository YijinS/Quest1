package com.example.quest1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        goBtn.setOnClickListener {
            val name = nameEdt.text.toString()
            val birth = bdEdt.text.toString()
            val nic = nicEdt.text.toString()

            val syIntent = Intent(this, ProfilActivity::class.java)

//            중첩가능
            syIntent.putExtra("name", name)
                .putExtra("birth", birth)
                .putExtra("nic", nic)
            startActivity(syIntent)


        }

//        val email = intent.getStringExtra("email")
//        mailTxt.text = email

    }
}