package br.com.ifpe.gleicekelly.alagaaquialagala

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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