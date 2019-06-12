package com.example.tugaskotlinanko

import android.graphics.Color
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class AfterClass : AppCompatActivity(), AnkoLogger {
    companion object{
        lateinit var nama : TextView
//        lateinit var btn_go : Button
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewAfter().setContentView(this)
        nama.text = intent.getStringExtra("nama")
    }

    override fun onBackPressed() {
        alert("Apakah amda yakin ingin keluar aplikasi", "Warning") {
            positiveButton("Iya"){
                finish()
            }
            negativeButton("Tidak") {
                //
            }
        }.show()
    }

    class ViewAfter : AnkoComponent<AfterClass> {
        override fun createView(ui: AnkoContext<AfterClass>) = with(ui) {
            verticalLayout {
                lparams {
                    width = matchParent
                    height = matchParent
                    padding = 20
                }
                textView {
                    text = "Welcome"
                    textSize = 20.0f
                }.lparams(wrapContent, wrapContent)
                nama = textView {
                    textSize = 30.0f
                }.lparams(wrapContent, wrapContent) {
                    topMargin = 25
                    bottomMargin = 150
                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                        bottomMargin = 75
                    }
                    onClick {
                        toast("Latihan Anko Layout 1")
                    }
                    imageView {
                        imageResource = R.drawable.android_b
                        backgroundColor = Color.parseColor("#C0F7D8")
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#c5cbd6")
                        textView {
                            text = "Latihan Anko Layout 1"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                        bottomMargin = 75
                    }
                    onClick {
                        toast("Latihan Anko Layout 2")
                    }
                    imageView {
                        imageResource = R.drawable.android_b
                        backgroundColor = Color.parseColor("#C0F7D8")
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#c5cbd6")
                        textView {
                            text = "Latihan Anko Layout 2"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
                linearLayout {
                    lparams(matchParent, 200) {
                        margin = 25
                        bottomMargin = 75
                    }
                    onClick {
                        toast("Latihan Anko Layout 3")
                    }
                    imageView {
                        imageResource = R.drawable.android_b
                        backgroundColor = Color.parseColor("#C0F7D8")
                    }.lparams(200, 200)
                    verticalLayout {
                        lparams(matchParent, matchParent) {
                            verticalGravity = Gravity.CENTER
                        }
                        backgroundColor = Color.parseColor("#c5cbd6")
                        textView {
                            text = "Latihan Anko Layout 3"
                            textSize = 22.0f
                        }.lparams {
                            marginStart = 20
                        }
                    }

                }
            }
        }
    }
}