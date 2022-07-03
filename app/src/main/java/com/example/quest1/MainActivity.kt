package com.example.quest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //res 폴더의 activity_main.xml을 연결해줌. 화면 연결용

//        signUpBtn.setOnClickListener {
//            Toast.makeText(this, "회원가입버튼 클릭", Toast.LENGTH_SHORT).show()
//        }
//
//        logInBtn.setOnClickListener {
//            Log.d("메인 엑티비티", "로그인 버튼 클릭")
//        }


        logInBtn.setOnClickListener {
//            id값.text 하면 id 값에 있던 데이터가 변수에 저장된다
            val id = idEdt.text.toString()
            val pw = pwEdt.text.toString()

//            로그인 버튼을 눌렀을때 id가 admin이고 비밀번호가 asdf라면 로그인성공.
//            로그인 성공시 toast로 관리자님 환영합니다
//             id가 틀린경우 toast가 id가 잘못되었습니다를 출력
//                비밀번호는 비밀번호가 잘못되었습니다 출력
            if(id != "admin") {
                Toast.makeText(this,"id가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            }else if (pw != "asdf"){
                Toast.makeText(this, "pw가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            }
            else if(id == "admin" && pw == "asdf" ){
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }
        }



    }
}