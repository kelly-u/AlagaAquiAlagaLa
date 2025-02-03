package br.com.ifpe.gleicekelly.alagaaquialagala

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{}
        binding.textCriarConta.setOnClickListener{
            startActivity(Intent(this, RegistroActivity::class.java))
        }
        binding.textEsqueceuSenha.setOnClickListener{}

        }
    }