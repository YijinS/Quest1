package com.example.quest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //res 폴더의 activity_main.xml을 연결해줌. 화면 연결용

        signUpBtn.setOnClickListener {
            Toast.makeText(this, "회원가입버튼 클릭", Toast.LENGTH_SHORT).show()
        }

        logInBtn.setOnClickListener {
            Log.d("메인 엑티비티", "로그인 버튼 클릭")
        }

    }
}