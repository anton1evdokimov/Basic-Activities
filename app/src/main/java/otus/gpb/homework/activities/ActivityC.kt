package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityC : AppCompatActivity() {

    private lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        button1 = findViewById(R.id.openActivityD)
        button1.setOnClickListener{
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.openActivityA).setOnClickListener{
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.closeActivityC).setOnClickListener{
            finish()
        }

        findViewById<Button>(R.id.closeStack).setOnClickListener{
            finishAffinity()
        }
    }
}