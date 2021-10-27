package com.example.weektwo

import android.app.Application
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.view.View



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Grab the textview where the state of the activity will show
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onCreate()") //this displays the onCreate state
    }

    override fun onStart() {
        super.onStart()
        var start = Runnable {
            // Grabbing the textView inside the Runnable
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onStart()")
        }
        var star = Handler() //the handler delays what is in the Runnable by 2 secs
        star.postDelayed(start,2000)
    }

    override fun onResume() {
        super.onResume()
        var resume = Runnable {
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onResume()")
        }
        var resum = Handler() //this handler implements a delay of 4 secs for the Runnable content
        resum.postDelayed(resume, 4000)
    }

    override fun onPause() {
        super.onPause()
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onPause()")
    }

    override fun onStop() {
        super.onStop()
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onStop()")
        }

    override fun onRestart() {
        super.onRestart()
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onRestart()")
        }

    override fun onDestroy() {
        super.onDestroy()
        var secondTextView: TextView = findViewById<TextView>(R.id.textView2)
        secondTextView.setText("State of the Activity: onDestroy()")
        }

//The codes responsible for the orientation count starts here

    var orientationChangeCountPortrait = 1
    var orientationChangeCountLandscape = 0

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
// Grabbing the textView where the Orientation change will be displayed
        val firstTextView = findViewById<TextView>(R.id.textView1)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            orientationChangeCountLandscape++
            firstTextView.text = "LAND SCAPE: ${orientationChangeCountLandscape}"
            //String template is used to also calculate and the numerical count
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            orientationChangeCountPortrait++
            firstTextView.setText("PORTRAIT: ${orientationChangeCountPortrait}")
        }
    }

}





