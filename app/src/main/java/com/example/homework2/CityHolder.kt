package com.example.homework2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework2.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onClick: (City) -> Unit,
): ViewHolder(binding.root) {
    fun onBind(city: City) {
        binding.run {
            tvCity.text = city.name
            tvCountry.text = city.country

           glide
                .load(city.url)
                .error(R.drawable.baseline_settings_24)
                .placeholder(R.drawable.baseline_settings_24)
                .into(ivImage)

           root.setOnClickListener{
               onClick.invoke(city)
           }
        }
    }
}