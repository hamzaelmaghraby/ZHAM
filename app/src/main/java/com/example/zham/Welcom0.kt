package com.example.zham

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.zham.databinding.FragmentWelcom0Binding

/**
 * A simple [Fragment] subclass.
 * Use the [Welcom0.newInstance] factory method to
 * create an instance of this fragment.
 */
class Welcom0 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWelcom0Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcom0, container, false)
        binding.getStartedButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_welcom0_to_welcome1)
        }
        return binding.root
    }


}