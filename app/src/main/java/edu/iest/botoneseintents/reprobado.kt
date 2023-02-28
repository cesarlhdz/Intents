package edu.iest.botoneseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reprobado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reprobado)

        var bnRegresar= findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener {
            finish()
        }
    }
}