package com.example.quest1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*
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

//      회원가입 창으로 이동하는 method
        signUpBtn.setOnClickListener {
            val myIntent = Intent(this, signUpActivity::class.java)  //this란 이곳에서 출발한다는 뜻. 그 뒤는 어느 코틀린 파일로 갈 것인지 작성
            startActivity(myIntent)  //실제 구동. stack 개념임 뒤로가기하면 전 화면으로 돌아감


        }
//        회원가입 이후로 이동하는 method
        logInBtn.setOnClickListener {
            val inputEmail = idEdt.text.toString()
            val afterSignUp = Intent(this, MainActivity2::class.java)
//            로그인시 해당 이메일을 로그인 후 화면에 전달한다
            afterSignUp.putExtra("email", inputEmail)
            startActivity(afterSignUp)
        }

////      로그인 성공 여부 로직

//        logInBtn.setOnClickListener {
////            id값.text 하면 id 값에 있던 데이터가 변수에 저장된다
//            val id = idEdt.text.toString()
//            val pw = pwEdt.text.toString()
//
////            로그인 버튼을 눌렀을때 id가 admin이고 비밀번호가 asdf라면 로그인성공.
////            로그인 성공시 toast로 관리자님 환영합니다
////             id가 틀린경우 toast가 id가 잘못되었습니다를 출력
////                비밀번호는 비밀번호가 잘못되었습니다 출력
//            if(id != "admin") {
//                Toast.makeText(this,"id가 잘못되었습니다", Toast.LENGTH_SHORT).show()
//            }else if (pw != "asdf"){
//                Toast.makeText(this, "pw가 잘못되었습니다", Toast.LENGTH_SHORT).show()
//            }
//            else if(id == "admin" && pw == "asdf" ){
//                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
//            }else{
//                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
//            }
//        }



    }
}