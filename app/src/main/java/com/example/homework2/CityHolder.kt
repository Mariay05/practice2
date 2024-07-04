package com.example.homework2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework2.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding
): ViewHolder(binding.root) {
    fun onBind(city: City) {
        binding.run {
            tvCity.text = city.name
            tvCountry.text = city.country
        }
    }
}