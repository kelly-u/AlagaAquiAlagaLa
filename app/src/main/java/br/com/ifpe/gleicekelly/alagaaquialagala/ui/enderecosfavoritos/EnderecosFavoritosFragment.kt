package br.com.ifpe.gleicekelly.alagaaquialagala.ui.enderecosfavoritos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.FragmentEnderecosfavoritosBinding

class EnderecosFavoritosFragment : Fragment() {

    private lateinit var binding: FragmentEnderecosfavoritosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEnderecosfavoritosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtEnderecosfavoritos.text = "Página dos seus endereços favoritos"

    }

}