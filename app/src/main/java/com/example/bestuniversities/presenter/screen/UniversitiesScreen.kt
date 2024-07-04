package com.example.bestuniversities.presenter.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bestuniversities.R
import com.example.bestuniversities.databinding.ScreenUniversitiesBinding
import com.example.bestuniversities.presenter.adapter.UniversitiesAdapter
import com.example.bestuniversities.presenter.viewmodel.UniversitiesVM
import com.example.bestuniversities.presenter.viewmodel.UniversitiesVMImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UniversitiesScreen : Fragment(R.layout.screen_universities) {
    private val binding by viewBinding(ScreenUniversitiesBinding::bind)
    private val adapter by lazy { UniversitiesAdapter() }
    private val viewModel: UniversitiesVM by viewModels<UniversitiesVMImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.list.adapter = adapter
        binding.list.layoutManager = LinearLayoutManager(requireContext())

        val animationView = binding.info
        animationView.setAnimation("info.json")
        animationView.playAnimation()

        binding.info.setOnClickListener {
            findNavController().navigate(UniversitiesScreenDirections.actionUniversitiesScreenToInfoScreen())
        }
        adapter.submitList(viewModel.getUniversList())

        adapter.setOnClick {
            findNavController().navigate(
                UniversitiesScreenDirections.actionUniversitiesScreenToUniversityInfoScreen(
                    it.photo,
                    it.nameUnivers,
                    it.definition
                )
            )
        }
    }
}