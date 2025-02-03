package br.com.ifpe.gleicekelly.alagaaquialagala

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCadastro.setOnClickListener{
            //Validar Cadastro
            finish()
        }
        binding.textFacaLogin.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}