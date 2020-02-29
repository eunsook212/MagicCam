package com.wgf.magiccam.Activity

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wgf.magiccam.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(">> onCreate!")

        //https://www.tutorialkart.com/kotlin-android/set-onclicklistener-button-kotlin-android/
        val btn_toast = findViewById(R.id.btn_toast) as Button
        btn_toast.setOnClickListener{
            Toast.makeText(this, "Hello My MagicCam Application!!", Toast.LENGTH_LONG).show()
        }

        //https://android--code.blogspot.com/2018/02/android-kotlin-alertdialog-example.html
        val btn_dialog = findViewById(R.id.btn_dialog) as Button
        btn_dialog.setOnClickListener {

//            val myDialog = MyDialog()
//            myDialog.show(supportFragmentManager, "123")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("App 종료")
            builder.setMessage("Magic Cam App을 종료 하시겠습니까???")

            //확인 버튼 클릭
            builder.setPositiveButton("YES") {dialog, which ->
                Toast.makeText(this,"Ok, Finish.",Toast.LENGTH_SHORT).show()
                finish()
            }

            //취소 버튼 클릭
            builder.setNegativeButton("NO") {dialog, which ->
                Toast.makeText(this,"No, Finish.",Toast.LENGTH_SHORT).show()
            }

            val dialog: AlertDialog = builder.create()

            dialog.show()

        }

        val btn_camera = findViewById(R.id.btn_Camera) as Button
        btn_camera.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        val btn_list = findViewById(R.id.btn_Listview) as Button
        btn_list.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        println(">> onStart!")
    }

    override fun onResume() {
        super.onResume()
        println(">> onResume!")
    }

    override fun onPause() {
        super.onPause()
        println(">> onPause!")
    }

    override fun onStop() {
        super.onStop()
        println(">> onStop!")
    }

    override fun onRestart() {
        super.onRestart()
        println(">> onRestart!")
    }

    override fun onDestroy() {
        super.onDestroy()
        println(">> onDestroy!")
    }
}

