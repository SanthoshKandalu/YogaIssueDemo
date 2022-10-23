package com.example.yogaissuedemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.yogaissuedemo.databinding.FragmentFirstBinding
import com.facebook.yoga.YogaConstants

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            binding.textInsideYoga.text = "I am setting a bigger text to show that the parent YogaLayout does not change its height for the change in the text. This has been a big issue especially when using YogaLayout as child of Recycler view"
            binding.yogaContainer.getYogaNodeForView(binding.textInsideYoga).dirty()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}