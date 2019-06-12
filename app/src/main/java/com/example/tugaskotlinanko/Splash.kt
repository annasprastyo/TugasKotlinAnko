package com.example.tugaskotlinanko

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.view.Gravity
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.*

class Splash : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000 //3 seconds

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewSplash().setContentView(this)

        //Initialize the Handler
        mDelayHandler = Handler()

        //Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

    }

    class ViewSplash : AnkoComponent<Splash> {
        override fun createView(ui: AnkoContext<Splash>) = with(ui){
            verticalLayout {
                lparams{
                    width = matchParent
                    height = matchParent
                    padding = 30
                    verticalGravity = Gravity.CENTER
//                    backgroundColor = R.color.colorPrimary
                }
                imageView{
                    setImageResource(R.drawable.android_splash)
                }.lparams(width = matchParent, height = wrapContent){
                    margin = 15
                    bottomMargin = 50
                }
                textView{
                    text = "LATIHAN ANKO LAYOUT"
                    textSize = 20.0f
                    textColor = Color.BLACK
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                }.lparams(width = matchParent, height = wrapContent){
                    margin = 15
                }
                textView{
                    text = "vesi 1.0"
                    textSize = 18.0f
                    textColor = Color.BLACK
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                }.lparams(width = matchParent, height = wrapContent){
                    margin = 15
                }
            }
        }

    }
}