package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework2.databinding.FragmentSettingsBinding


class SettingsFragment: Fragment(R.layout.fragment_settings) {

    private var binding: FragmentSettingsBinding? = null

    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


private fun initAdapter() {
    adapter = CityAdapter(CityRepository.cities)

    binding?.run {
        rvCity.adapter = adapter
        rvCity.layoutManager = LinearLayoutManager(requireContext())
         }
    }
}
