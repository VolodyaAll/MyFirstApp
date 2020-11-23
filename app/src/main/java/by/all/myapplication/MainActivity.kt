package by.all.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.main_activity_text_view_1)
        textView1.setOnClickListener { moveToDetailsScreen() }
    }

    private fun moveToDetailsScreen() {
        val intent = Intent(this, MovieDetailsActivity::class.java)

        startActivity( intent )
    }
}