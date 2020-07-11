package com.example.secpass.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.secpass.R
import kotlinx.android.synthetic.main.activity_user_login.*

class UserLoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        initView()
    }

    private fun initView() {
        tvLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvLogin -> {

            }
        }
    }
}
