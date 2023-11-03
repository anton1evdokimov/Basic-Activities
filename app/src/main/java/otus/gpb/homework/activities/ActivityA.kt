package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityA : AppCompatActivity() {

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        button = findViewById(R.id.buttonA)
        button.setOnClickListener{
            Log.d((ActivityA::class.java).toString(),"click on button" )
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        Log.d("log ActivityA", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("log ActivityA", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("log ActivityA", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("log ActivityA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("log ActivityA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("log ActivityA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("log ActivityA", "onDestroy")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("log ActivityA", "onNewIntent")
    }
}