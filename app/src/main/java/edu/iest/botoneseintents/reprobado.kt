package edu.iest.botoneseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class reprobado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reprobado)

        var calificacion = intent.getIntExtra("calificacion", 0)
        Toast.makeText(this,"Tu calificacion fue de "+calificacion+ " :( ", Toast.LENGTH_LONG).show()

        var bnRegresar= findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener {
            finish()
        }
    }
}