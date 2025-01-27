package br.com.ifpe.gleicekelly.alagaaquialagala.ui.buscarendereco

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.FragmentBuscarenderecoBinding

class BuscarEnderecoFragment : Fragment() {

    private lateinit var binding: FragmentBuscarenderecoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBuscarenderecoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtBuscarendereco.text = "Página de busca de endereços"

    }

}