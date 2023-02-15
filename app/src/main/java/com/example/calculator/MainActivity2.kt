package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import android.os.Bundle
import android.view.View
import com.example.calculator.R

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    var resultTv: TextView? = null
    var solutionTv: TextView? = null
    var buttonC: MaterialButton? = null
    var buttonBrackOpen: MaterialButton? = null
    var buttonBrackClose: MaterialButton? = null
    var button0: MaterialButton? = null
    var button1: MaterialButton? = null
    var button2: MaterialButton? = null
    var button3: MaterialButton? = null
    var button4: MaterialButton? = null
    var button5: MaterialButton? = null
    var button6: MaterialButton? = null
    var button7: MaterialButton? = null
    var button8: MaterialButton? = null
    var button9: MaterialButton? = null
    var buttonAC: MaterialButton? = null
    var buttonDot: MaterialButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        resultTv = findViewById(R.id.result_tv)
        solutionTv = findViewById(R.id.solution_tv)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
        assignId(buttonC, R.id.button_c)
    }

    fun assignId(btn: MaterialButton?, id: Int) {
        var btn = btn
        btn = findViewById(id)
        btn.setOnClickListener(this)
    }

    override fun onClick(view: View) {}
}