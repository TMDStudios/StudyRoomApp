package com.tmdstudios.studyroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.btBlanks).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_blanksFragment)
        }

        view.findViewById<Button>(R.id.btRegularIrregular).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_regularIrregularFragment)
        }

        view.findViewById<Button>(R.id.btConjugation).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_conjugationFragment)
        }

        return view
    }
}