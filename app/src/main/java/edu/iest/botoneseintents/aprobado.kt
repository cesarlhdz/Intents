package edu.iest.botoneseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class aprobado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprobado)

        var calificacion = intent.getIntExtra("calificacion", 0)
        Toast.makeText(this,"Tu calificacion fue de "+calificacion+ " :) ",Toast.LENGTH_LONG).show()

    }
}