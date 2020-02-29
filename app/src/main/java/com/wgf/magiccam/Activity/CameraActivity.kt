package com.wgf.magiccam.Activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.wgf.magiccam.R
import kotlinx.android.synthetic.main.activity_camera.*

class CameraActivity() : AppCompatActivity(), View.OnClickListener {

    private val OPEN_GALLERY = 1
    private val OPEN_CAMERA = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        val iv_image = findViewById(R.id.iv_image) as ImageView
        val btn_album = findViewById(R.id.btn_album) as Button
        val btn_camera = findViewById(R.id.btn_camera) as Button

        btn_album.setOnClickListener(this)
        btn_camera.setOnClickListener(this)
    }

    // https://milkissboy.tistory.com/83
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_album -> addFromMyGallery()
            R.id.btn_camera -> addFromCamera()
            else -> {
                println(">> No Exist View ID!!")
            }
        }
    }

    // 1. 앨범 열기
    // https://one-delay.tistory.com/40
    fun addFromMyGallery() {
        var galleryIntent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        galleryIntent.setType("image/*")
        startActivityForResult(galleryIntent, OPEN_GALLERY)
    }

    // 1. 카메라로 촬영 열기
    //https://taekwang.tistory.com/5?category=788939
    fun addFromCamera() {
        var cameraIntent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//        var uri: Uri? =

    }

    // 2. 자르기
    fun setCrop() {

    }

    // 3. 비트맵
    fun setBitmap() {

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK) {

//            if(requestCode == OPEN_GALLERY) {
//                var currentImageUrl: Uri? = data?.data
//
//                if(SDK_INT <= 21) {
//
//                }
//
//                try {
//                    val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, currentImageUrl)
//                    iv_image.setImageBitmap(bitmap)
//                } catch (e:Exception) {
//
//                }
//            }
            when(requestCode) {
                1 -> openGallery()
                2 -> openCamera()
            }


        } else {
            println(">> Activity Result is Something Wrong!!")
        }

    }

    fun openGallery() {

    }

    fun openCamera() {

    }

}
