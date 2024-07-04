package com.example.bestuniversities.presenter.screen

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bestuniversities.R
import com.example.bestuniversities.databinding.ScreenUniverInfoBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class UniversityInfoScreen : Fragment(R.layout.screen_univer_info) {

    private val binding by viewBinding(ScreenUniverInfoBinding::bind)
    private val navArgs: UniversityInfoScreenArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }


        binding.unverName.text = navArgs.name
        binding.unverAbout.text = getText(navArgs.definition)
        binding.image.setImageResource(navArgs.image)

        binding.unverName.ellipsize = TextUtils.TruncateAt.MARQUEE
        binding.unverName.isSingleLine = true
        binding.unverName.isSelected = true
    }
}