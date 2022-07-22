package com.jptadros.jpsnewsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jptadros.jpsnewsapp.R
import kotlinx.android.synthetic.main.fragment_edit_profile.*


class EditProfileFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnUpdateProfile.setOnClickListener {
            findNavController().navigate(R.id.action_editProfileFragment_to_homeFragment)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_edit_profile, container, false)



        return view
    }
}