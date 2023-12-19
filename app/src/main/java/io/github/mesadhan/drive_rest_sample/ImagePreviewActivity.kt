import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import io.github.mesadhan.drive_rest_sample.R

import com.bumptech.glide.Glide

class ImagePreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.showImage)

        // Retrieve the URI of the selected image from the intent
        val imageUri: Uri? = intent.getParcelableExtra("imageUri")

        // Load and display the selected image using Glide (or your preferred image loading library)
        if (imageUri != null) {
            Glide.with(this)
                .load(imageUri)
                .into(imageView)
        }
    }
}