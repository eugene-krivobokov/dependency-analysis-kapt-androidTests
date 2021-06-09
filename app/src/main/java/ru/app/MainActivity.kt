package ru.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.success_button).setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().putExtra(RESULT_KEY, SUCCESS))
            finish()
        }

        findViewById<Button>(R.id.failure_button).setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().putExtra(RESULT_KEY, FAILURE))
            finish()
        }

        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}


private const val RESULT_KEY = "ru.app.extra.EXTRA_RESULT"
private const val SUCCESS = "SUCCESS"
private const val FAILURE = "FAILURE"