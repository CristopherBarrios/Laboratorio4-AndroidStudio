package com.example.lab_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    private var textView: TextView? = null
    private var textView2: TextView? = null
    private var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView) as TextView
        textView2 = findViewById(R.id.textView2) as TextView
        editText = findViewById(R.id.editText) as EditText
    }
    fun onClic(v: View?){
        textView?.visibility = View.GONE
        editText?.visibility = View.GONE
    }
}
