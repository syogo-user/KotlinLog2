package jp.techacademy.shogo.kotlinlog2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var human1 = Human("田口",25,"ピアノ")
        var human2 = Human("高木",28,"テニス")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}
