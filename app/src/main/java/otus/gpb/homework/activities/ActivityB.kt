package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        button = findViewById(R.id.buttonB)
        button.setOnClickListener{
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}