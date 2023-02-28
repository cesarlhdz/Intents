package edu.iest.botoneseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnEnviar= findViewById<Button>(R.id.bnEnviar)
        bnEnviar.setOnClickListener{
            val i = Intent(this, reprobado::class.java)
            i.putExtra("edad", 21) //enviamos dato "edad" con valor 21
            startActivity(i)
        }
    }
}