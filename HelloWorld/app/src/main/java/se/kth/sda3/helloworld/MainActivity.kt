package se.kth.sda3.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello.setOnClickListener {
            val name: String = inputName.text.toString()
            var displayName: String

            if (name.isNullOrBlank()) {
                displayName = "World"
            } else {
                displayName = name.toString()
            }

            AlertDialog.Builder(this)
                    .setMessage("Hello, $displayName ")
                    .setPositiveButton("Ok", { dialog, _ -> dialog.dismiss() })
                    .setCancelable(true)
                    .create()
                    .show()

        }
    }
}
