package com.example.pr15bel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class LoginActivity : AppCompatActivity() {
    private lateinit var log: EditText
    private lateinit var por: EditText
    private lateinit var st: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        log = findViewById(R.id.log)
        por = findViewById(R.id.por)
        st = findViewById(R.id.st)
    }

    fun start(view: View) {

        if (log.text.toString() == "ekts" && por.text.toString() == "ekts2024") {
            val intent = Intent(this, GeoQuizActivity::class.java)
            startActivity(intent)
        }
        else
         Toast.makeText(this, R.string.evil_por, Toast.LENGTH_SHORT).show()
    }
}