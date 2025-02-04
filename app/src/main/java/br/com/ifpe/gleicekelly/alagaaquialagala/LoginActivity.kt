package br.com.ifpe.gleicekelly.alagaaquialagala

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java).setFlags(
                    Intent.FLAG_ACTIVITY_SINGLE_TOP
                )
            )
        }

        binding.textCriarConta.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
        binding.textEsqueceuSenha.setOnClickListener {}
    }
}