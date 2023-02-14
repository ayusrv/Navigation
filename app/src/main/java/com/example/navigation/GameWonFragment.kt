package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won, container, false)

        binding.nextMatchButton.setOnClickListener{ view: View ->
            view.findNavController().navigate(GameWonFragmentDirections.actionGameWonFragmentToTitleFragment())
        }

        var args = GameWonFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context,"Number Correct: ${args.numCorrect}, Number Questions: ${args.numQuestions}",Toast.LENGTH_LONG).show()
        return binding.root
    }
}