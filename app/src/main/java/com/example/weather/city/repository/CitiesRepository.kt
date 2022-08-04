package com.example.weather.city.repository

import com.example.weather.city.model.City
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CitiesRepository
@Inject constructor() {
    fun cities(): List<City> = listOf(
        City(
            name = "New York",
            weatherUrl = "https://api.open-meteo.com/v1/forecast?latitude=40.71&longitude=-74.01&hourly=temperature_2m"
        ),
        City(
            name = "Vancouver",
            weatherUrl = "https://api.open-meteo.com/v1/forecast?latitude=49.25&longitude=-123.12&hourly=temperature_2m"
        ),
        City(
            name = "Ottawa",
            weatherUrl = "https://api.open-meteo.com/v1/forecast?latitude=45.4235&longitude=-75.6979&hourly=temperature_2m"
        )
    )
}