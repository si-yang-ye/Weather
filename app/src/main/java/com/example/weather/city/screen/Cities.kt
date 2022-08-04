package com.example.weather.city.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.weather.city.model.City
import com.example.weather.databinding.FragmentCitiesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Cities : Fragment() {

    private var _binding: FragmentCitiesBinding? = null

    private val binding get() = requireNotNull(_binding)

    private val citiesViewModel: CitiesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cities.adapter = CitiesAdapter(this::onCityClicked).also {
            it.submitList(citiesViewModel.cities())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onCityClicked(city: City) {
        findNavController().navigate(
            CitiesDirections.actionCitiesToSecondFragment(
                city.name, city.weatherUrl
            )
        )
    }
}