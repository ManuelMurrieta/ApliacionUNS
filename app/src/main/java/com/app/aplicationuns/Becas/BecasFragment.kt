package com.fredy.aplicationuns.Becas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.fredy.aplicationuns.R
import com.fredy.aplicationuns.databinding.FragmentBecasBinding

class BecasFragment : Fragment() {

    private var _binding: FragmentBecasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBecasBinding.inflate(inflater, container, false)

        setupRecyclerView()
        setupFab()

        return binding.root
    }

    private fun setupRecyclerView() {
        val becas = listOf(
            Beca("Beca Estudiante", "Para estudiantes con alto rendimiento", R.drawable.sample_beca),
            Beca("Beca Estudio compelementario", "Beca para estudiantes en el extranjero", R.drawable.sample_beca)
        )

        val adapter = BecasAdapter(becas)
        binding.recyclerViewBecas.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewBecas.adapter = adapter
    }

    private fun setupFab() {
        binding.fab.setOnClickListener {
            Toast.makeText(requireContext(), "Seleccionar Beca", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}