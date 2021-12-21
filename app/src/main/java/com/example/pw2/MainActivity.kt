package com.example.pw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val NCREATE: String = "Activity CREATED"
    val NSTART: String = "Activity STARTED"
    val NRESUME: String = "Activity RESUMED"
    val NPAUSE: String = "Activity PAUSED"
    val NSTOP: String = "Activity STOPPED"
    val NRESTART: String = "Activity RESTARTED"
    val NDESTROY: String = "Activity DESTROYED"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        Toast.makeText(this, NCREATE, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NSTART, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.LEFT, 0, 0)
        message.show()
    }

    override fun onResume() {
        super.onResume()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NRESUME, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.TOP, 0, 0)
        message.show()
    }

    override fun onPause() {
        super.onPause()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NPAUSE, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.RIGHT, 0, 0)
        message.show()
    }

    override fun onStop() {
        super.onStop()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NSTOP, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.CENTER, 0, 0)
        message.show()
    }

    override fun onRestart() {
        super.onRestart()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NRESTART, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.FILL_HORIZONTAL, 0, 0)
        message.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        //setContentView(R.layout.activity_main)
        var message = Toast.makeText(this, NDESTROY, Toast.LENGTH_SHORT)
        message.setGravity(Gravity.FILL, 0, 0)
        message.show()
    }
}