package fr.mastersid.barre.controleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import fr.mastersid.barre.controleapp.databinding.FragmentPlayBinding
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs

/**
 *Created by Bryan BARRE on 03/05/2021.
 */
class PlayFragment:Fragment() {
    private lateinit var _binding: FragmentPlayBinding
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlayBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: PlayFragmentArgs by navArgs()
        val playModel: PlayModel by viewModels(
                factoryProducer = { PlayModelFactory (this , args . number ) })
        System.out.println(playModel.num)
        _binding.buttonMultiplier.text= "X "+playModel.num.toString()

        _binding.buttonMultiplier.setOnClickListener {
            playModel.multiplie()
        }

        _binding.buttonAditioner.setOnClickListener {
            playModel.addition()
        }

        playModel.result.observe(viewLifecycleOwner) { value ->
            if (value == PlayModel.NO_NUMBER) {
                _binding.numberView.visibility = View.GONE
            } else {
                _binding.numberView.visibility = View.VISIBLE

                System.out.println(R.string.number_text)
                _binding.numberView.text= value.toString()
            }
            if(value==100){
                _binding.smiley.setImageResource(R.drawable.ic_baseline_mood_24)
            }
            if (value>100){
                _binding.smiley.setImageResource(R.drawable.ic_baseline_mood_bad_24)

            }
        }
    }
}
