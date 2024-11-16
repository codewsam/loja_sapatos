package com.example.app_loja

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val rootView: View = findViewById(R.id.tela3id)

        // Configura o comportamento de "edge-to-edge" (sem barras do sistema atrapalhando o layout)
        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            // Ajuste o padding para que o conteúdo não fique oculto pelas barras do sistema
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // Retorna os insets para que eles possam ser aplicados corretamente
            insets
        }


    }
}