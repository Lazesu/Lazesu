package com.example.drivezer

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ซ่อน Title bar
        supportActionBar?.hide()
        // Buttton  btn = findViewById(R.id.btn_phrae);

        btn_1.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.aa)?.let { it1 -> setProvice(it1, getString(R.string.btn_1),getString(R.string.history_1)) }

        })
        btn_2.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.bb)?.let { it1 -> setProvice(it1, getString(R.string.btn_2),getString(R.string.history_2)) }

        })
        btn_3.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.cc)?.let { it1 -> setProvice(it1, getString(R.string.btn_3),getString(R.string.history_3)) }

        })
        btn_4.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.dd)?.let { it1 -> setProvice(it1, getString(R.string.btn_4),getString(R.string.history_4)) }

        })



    }

    fun setProvice (drawable :Drawable, header:String , content:String ){

        img_province.setImageDrawable(drawable)  //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติของแพร่

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}
