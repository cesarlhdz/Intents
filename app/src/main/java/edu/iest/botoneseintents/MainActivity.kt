package edu.iest.botoneseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var etCalificacion: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCalificacion = findViewById(R.id.etCalificacion)
        var bnEnviar = findViewById<Button>(R.id.bnEnviar)

        bnEnviar.setOnClickListener {
            val calificacion = obtenerCalificacion()
            if (calificacion >= 7) {
                val i = Intent(this, aprobado::class.java)
                i.putExtra("calificacion", calificacion)
                startActivity(i)
            } else if (calificacion < 7) {
                val i = Intent(this, reprobado::class.java)
                i.putExtra("calificacion", calificacion)
                startActivity(i)
            }
        }
    }
        private fun obtenerCalificacion() : Int {
            return etCalificacion.text.toString().toIntOrNull() ?: 0
        }
}


