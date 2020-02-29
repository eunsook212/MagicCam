package com.wgf.magiccam.Utils

import android.app.Application
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(this.activity!!)

        builder.setTitle("App 종료")
        builder.setMessage("Magic Cam App을 종료 하시겠습니까???")

        //확인 버튼 클릭
        builder.setPositiveButton("YES") {dialog, which ->
            println(">> YES!!")
//            Toast.makeText(,"Ok, Finish.", Toast.LENGTH_SHORT).show()
//            finish()
        }

        //취소 버튼 클릭
        builder.setNegativeButton("NO") {dialog, which ->
            println(">> No!!")
//            Toast.makeText(this,"No, Finish.", Toast.LENGTH_SHORT).show()
        }

        val dialog: AlertDialog = builder.create()

        dialog.show()

        return builder.create()
    }
}