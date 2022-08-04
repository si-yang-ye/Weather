package com.example.weather.city.screen

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.weather.city.model.City

class CitiesAdapter(val onClickListener: (City) -> Unit): ListAdapter<City, CityViewHolder>(
    object: DiffUtil.ItemCallback<City>() {
        override fun areItemsTheSame(oldItem: City, newItem: City): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: City, newItem: City): Boolean = true
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder =
        CityViewHolder.create(parent, onClickListener)

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}