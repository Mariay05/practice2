package com.example.homework2

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework2.databinding.FragmentProFileBinding


class ProFileFragment : Fragment(R.layout.fragment_pro_file) {
    private var binding: FragmentProFileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProFileBinding.bind(view)

        val email = arguments?.getString(Companion.ARG_EMAIL) ?: "ERROR"

        binding?.run{
            tvTitle.text = "${tvTitle.text} + $email"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object{
        fun bundle(email: String): Bundle = Bundle().apply {
            putString(ARG_EMAIL, email)
        }

        private const val ARG_EMAIL = "ARG_EMAIL"
    }
}
