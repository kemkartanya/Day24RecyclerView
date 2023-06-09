package me.tanyakemkar.day24recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val heading = intent.getStringExtra("heading")
        val image = intent.getIntExtra("imageId", R.drawable.img1)
        val newscontent = intent.getStringExtra("newscontent")

        val headingTV = findViewById<TextView>(R.id.newsHeading)
        val imageTV = findViewById<ImageView>(R.id.newsImage)
        val newscontentTV = findViewById<TextView>(R.id.newsContent)

        headingTV.text = heading
        imageTV.setImageResource(image)
        newscontentTV.text = newscontent
    }
}