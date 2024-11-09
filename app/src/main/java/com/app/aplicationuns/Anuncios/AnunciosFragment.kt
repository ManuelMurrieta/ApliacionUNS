package com.fredy.aplicationuns.Anuncios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fredy.aplicationuns.R
import com.fredy.aplicationuns.databinding.FragmentAnunciosBinding

class AnunciosFragment : Fragment() {

    private var _binding: FragmentAnunciosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnunciosBinding.inflate(inflater, container, false)

        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val anuncios = listOf(
            Anuncio("PRODUCTO ?NUNABROWNI? DE ESTUDIANTES DE UNS COMPETIRÁ EN CONCURSO INTERNACIONAL DE PUCP ",
                "“Nunabrowni” es el nombre del producto hecho a base de frijol de chivato, chía, yacón y soya que fue declarado ganador esta mañana por un jurado especialista en emprendimiento.",
                R.drawable.img1
            ),
            Anuncio("DOCENTE DE BIOLOGÍA UNS ES INCORPORADA COMO INVESTIGADORA RENACYT",
                "La docente del Departamento Académico de Biología, Microbiología y Biotecnología de la #UNS, bióloga acuicultora, Carmen Gabriela Yzasiga Barrera, tiene diversos trabajos de investigación y publicaciones en revistas científicas de alto impacto.",
                R.drawable.img2
            ),
            Anuncio("ESTUDIANTES DE INGENIERÍA MECÁNICA UNS SE ESPECIALIZAN EN METODOLOGÍA DE DISEÑO MECÁNICO",
                "Estudiantes del noveno ciclo de la escuela de Ingeniería Mecánica de la #UNS participaron de un curso de especialización sobre diseño mecánico según la norma alemana VDI 2221-2019",
                R.drawable.img3
            )
        )

        val adapter = AnunciosAdapter(anuncios)
        binding.recyclerViewAnuncios.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewAnuncios.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}