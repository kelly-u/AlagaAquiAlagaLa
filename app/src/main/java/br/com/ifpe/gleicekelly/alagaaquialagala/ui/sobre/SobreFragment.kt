package br.com.ifpe.gleicekelly.alagaaquialagala.ui.sobre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.ifpe.gleicekelly.alagaaquialagala.databinding.FragmentSobreBinding

class SobreFragment : Fragment() {

    private lateinit var binding: FragmentSobreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSobreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtSobre.text = "Página sobre o aplicativo"

    }

}