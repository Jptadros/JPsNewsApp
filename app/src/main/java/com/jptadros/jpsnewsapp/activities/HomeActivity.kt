package com.jptadros.jpsnewsapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.jptadros.jpsnewsapp.R
import com.jptadros.jpsnewsapp.fragments.AboutUsFragment
import com.jptadros.jpsnewsapp.fragments.ChangePasswordFragment
import com.jptadros.jpsnewsapp.fragments.EditProfileFragment
import com.jptadros.jpsnewsapp.fragments.LoginFragment
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.btnSignOut
import kotlinx.android.synthetic.main.fragment_home.tv_edit_profile

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val intentEdit = Intent(this, EditProfileFragment::class.java)
        tv_edit_profile.setOnClickListener{
            startActivity(intentEdit)

        }

        val intentChangePass = Intent(this, ChangePasswordFragment::class.java)
        tv_edit_profile.setOnClickListener{
            startActivity(intentChangePass)

        }
        val intentAboutUs = Intent(this, AboutUsFragment::class.java)
        tv_about_us_home.setOnClickListener{
            startActivity(intentAboutUs)
        }
        val intentSignOut = Intent(this, LoginFragment::class.java)
        btnSignOut.setOnClickListener{
            startActivity(intentSignOut)
        }

    }
    }
