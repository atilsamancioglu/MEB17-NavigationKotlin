package com.atilsamancioglu.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_birinci.*
import kotlinx.android.synthetic.main.fragment_ikinci.*


class BirinciFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_birinci, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        birinciFragmentButton.setOnClickListener {
            val action = BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment(40)
            Navigation.findNavController(it).navigate(action)
        }

    }

}