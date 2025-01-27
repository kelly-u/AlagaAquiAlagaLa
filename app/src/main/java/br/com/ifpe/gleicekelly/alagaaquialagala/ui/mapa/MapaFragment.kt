package br.com.ifpe.gleicekelly.alagaaquialagala.ui.mapa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.FragmentMapaBinding

class MapaFragment : Fragment() {

    private lateinit var binding: FragmentMapaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMapaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtMapa.text = "Página do mapa do Alaga Aqui, Alaga Lá"

    }

}