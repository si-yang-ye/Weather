package com.example.weather.city.screen

import androidx.lifecycle.ViewModel
import com.example.weather.city.model.City
import com.example.weather.city.repository.CitiesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CitiesViewModel @Inject constructor(
    private val citiesRepo: CitiesRepository
) : ViewModel() {

    fun cities(): List<City> =
        citiesRepo.cities()
}