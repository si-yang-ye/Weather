package com.example.weather.city.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.city.model.City
import com.example.weather.databinding.CityRowBinding

class CityViewHolder(private val binding: CityRowBinding, private val onClickListener: (City) -> Unit): RecyclerView.ViewHolder(binding.root) {

    fun onBind(city: City) {
        binding.city.apply {
            text = city.name
            setOnClickListener {
                onClickListener(city)
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup, onClickListener: (City) -> Unit): CityViewHolder =
            CityViewHolder(CityRowBinding.inflate(LayoutInflater.from(parent.context)), onClickListener)
    }
}