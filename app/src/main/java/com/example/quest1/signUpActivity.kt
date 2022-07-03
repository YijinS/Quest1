package com.example.quest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class signUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        회원 가입 버튼 눌렀을때의 로직 작성
        signUpBtn2.setOnClickListener {

            Toast.makeText(this, "$(nameSet.text)님 회원가입 축하드립니다", Toast.LENGTH_SHORT).show()
            finish()

        }
    }
}