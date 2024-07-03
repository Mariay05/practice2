package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.activity_main) {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding?.run {
            tvTitle.setOnClickListener{
//                val text = etEmail.text?.toString()
//                val bundle = Bundle()
//                bundle.putString("ARG_EMAIL", text)

                findNavController().navigate(
                    R.id.action_mainFragment_to_proFileFragment,
                    args = ProFileFragment.bundle(
                        email = et.text.toString(),
                    )
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}