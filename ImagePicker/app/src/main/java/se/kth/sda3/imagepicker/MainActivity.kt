package se.kth.sda3.imagepicker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val REQUEST_CODE_PICK_IMAGE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPickImage.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_PICK, null)
            // val myIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            myIntent.action = Intent.ACTION_GET_CONTENT
            myIntent.type = "image/*"
            startActivityForResult(myIntent, REQUEST_CODE_PICK_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Check which request we're responding to
        if (requestCode == REQUEST_CODE_PICK_IMAGE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                val imageURI = data?.data
                Picasso.get()
                        .load(imageURI)
                        .into(imageView)

                //imageView2.setImageURI(imageURI) alternate option
            } else {
                Toast.makeText(this,
                        "User Cancelled",
                        Toast.LENGTH_SHORT)
                        .show()
            }
        }
    }
}
