package com.wgf.magiccam.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.wgf.magiccam.R

class ListActivity : AppCompatActivity() {

    var listView : ListView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listView = findViewById(R.id.listview)

        //listview는 거의 val
        val item = arrayOf("목록 1", "목록 2", "목록 3", "목록 4")

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        listView?.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item)
        listView?.setOnItemClickListener{
            parent, view, position, id ->

        }
//        listView?.adapter = adapter
    }
}
