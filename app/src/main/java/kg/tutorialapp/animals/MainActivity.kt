package kg.tutorialapp.animals

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var img1: ImageView
    lateinit var img2: ImageView
    lateinit var img3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img1 = findViewById<ImageView>(R.id.image1)
        tv = findViewById<TextView>(R.id.textView)
        img1.setOnClickListener {
            tv.text = getString(R.string.image_1)
        img2 = findViewById<ImageView>(R.id.image2)
            img2.setOnClickListener {
                tv.text = getString(R.string.image_2)
        img3 = findViewById<ImageView>(R.id.image3)
            img3.setOnClickListener {
                tv.text = "Wombat"


                }
            }
        }
    }
}


