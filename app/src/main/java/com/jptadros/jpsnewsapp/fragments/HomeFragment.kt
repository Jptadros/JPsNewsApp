package com.jptadros.jpsnewsapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jptadros.jpsnewsapp.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.btnSignOut
import kotlinx.android.synthetic.main.fragment_home.tv_edit_profile

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        tv_edit_profile.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_editProfileFragment)

        }


        tv_change_password.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_changePasswordFragment)

        }

        tv_about_us.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_aboutUsFragment)
        }

        btnSignOut.setOnClickListener{ findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
        }

        btnNews.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_newsFragment)
        }
    }


}
