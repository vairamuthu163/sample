package com.vk.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val c:Context=applicationContext
        setContentView(R.layout.activity_main)
        val bnext:Button = findViewById(R.id.btnnext)
        val tname:EditText=findViewById(R.id.txtname)
        val lname:TextInputLayout=findViewById(R.id.txtlayoutname)
        bnext.setOnClickListener {
            val gotopage =Intent(c,Page::class.java)
            startActivity(gotopage)


            //val intent = Intent(context, MainActivity2::class.java).apply {
            //}
           // startActivity(intent)
        }
        supportActionBar!!.title="home"
    }

}