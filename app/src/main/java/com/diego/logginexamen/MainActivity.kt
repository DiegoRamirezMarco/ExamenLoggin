package com.diego.logginexamen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val usu = findViewById<EditText>(R.id.usuario)
        val contr = findViewById<EditText>(R.id.contraseña)
        val btnLogin = findViewById<Button>(R.id.botonLogin)

        btnLogin.setOnClickListener {
            val usuario = usu.text.toString()
            val contraseña = contr.text.toString()
            if (usuario.isNotEmpty() && contraseña.isNotEmpty()) {
                val intent = Intent(this, Resultado::class.java)
                intent.putExtra("USUARIO", usuario)
                startActivity(intent)
            }
        }
    }
}

