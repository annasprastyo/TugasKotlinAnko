package com.example.tugaskotlinanko

import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.text.InputType
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity(), AnkoLogger {

    companion object{
        lateinit var username : EditText
        lateinit var btn_go : Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewLogin().setContentView(this)
        btn_go.setOnClickListener {
            if (username.text.toString().equals("")){
                toast("Username harus di isi !!")
            }else {
                toast("Welcome ${username.text}")
                startActivity(intentFor<AfterClass>("nama" to username.text.toString()))
            }
        }


    }

    class ViewLogin : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui){
            verticalLayout {
                lparams{
                    width = matchParent
                    height = matchParent
                    padding = 30
                    verticalGravity = Gravity.CENTER
                    backgroundColor = R.color.abu
                }
                verticalLayout{
                    lparams(width = matchParent, height = wrapContent){
                        background = ResourcesCompat.getDrawable(resources, R.drawable.lengkung_login, null)
                        margin = 15
                        padding = 20
                    }
                    textView{
                        text = "Hello"
                        textSize = 25.0f
                        textColor = Color.BLACK
                        textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    }.lparams(width = matchParent, height = wrapContent){
                        margin = 15
                    }

                    username = editText {
                        hint = "please input your name"
                        inputType = InputType.TYPE_CLASS_TEXT
                    }.lparams(width = matchParent, height = wrapContent){
                        margin = 15
                        bottomMargin = 75
                    }

                    btn_go = button("GO"){
//                        id = R.id.btn_logn
                            textColor = Color.WHITE
                        background = ResourcesCompat.getDrawable(resources, R.drawable.selector_lengkung, null);
                    }.lparams(width = wrapContent, height = wrapContent){
                        margin = 15
                        gravity = Gravity.CENTER
                    }
                }
            }
        }

    }

}
