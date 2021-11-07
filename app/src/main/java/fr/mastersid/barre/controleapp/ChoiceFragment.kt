package fr.mastersid.barre.controleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import fr.mastersid.barre.controleapp.databinding.FragmentChoiceBinding

/**
 *Created by Bryan BARRE on 03/05/2021.
 */
class ChoiceFragment : Fragment() {
    private lateinit var _binding : FragmentChoiceBinding
    override fun onCreateView (inflater: LayoutInflater,
                               container: ViewGroup?,
                               savedInstanceState: Bundle?) : View? {
        _binding = FragmentChoiceBinding.inflate(inflater)
        return _binding . root
    }
    override fun onViewCreated (view : View, savedInstanceState : Bundle?) {
        super . onViewCreated (view , savedInstanceState )
        _binding.button.setOnClickListener {
            val number = 2
            val action = ChoiceFragmentDirections.actionChoiceFragmentToPlayFragment(number)
            findNavController().navigate(action)

        }
        _binding.button2.setOnClickListener {
            val number = 3
            val action = ChoiceFragmentDirections.actionChoiceFragmentToPlayFragment(number)
            findNavController().navigate(action)
        }
    }
}