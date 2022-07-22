package com.jptadros.jpsnewsapp.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.jptadros.jpsnewsapp.Constants
import com.jptadros.jpsnewsapp.Constants.viewSignup
import com.jptadros.jpsnewsapp.R
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.fragment_sign_up.view.*



class SignUpFragment : Fragment() {
    var SignupBTN: Button? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

       // SignupBTN?.setOnClickListener { findNavController().navigate(R.id.action_signUpFragment_to_homeActivity) }

/*
    fun checkSignUp() {


        var validation = false
        if (et_first_name.text?.isEmpty() == true) {

            et_first_name.hint = "This is a required field"
            validation = false

        } else {
            validation = true
        }

        if (et_last_name.text?.isEmpty() == true) {

            et_last_name.hint = "This is a required field"
            validation = false

        } else {
            validation = true
        }
        if (et_signup_email.text?.isEmpty() == true) {

            et_signup_email.hint = "This is a required field"
            validation = false

        } else {
            validation = true
        }

        if (et_signup_password.text?.isEmpty() == true) {

            et_signup_password.hint = "This is a required field"
            validation = false

        } else {
            validation = true
        }
        if (et_signup_password.text != et_signup_password_repeat.text) {

            et_signup_password_repeat.hint = "Passwords do not match"
            validation = false

        }


    }

 */
    }






    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Constants.viewSignup =  inflater.inflate(R.layout.fragment_sign_up, container, false)
        SignupBTN = Constants.viewSignup.btnSignUpUser




        return viewSignup

    }



}

