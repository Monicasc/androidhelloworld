package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etPassword
import kotlinx.android.synthetic.main.activity_main.tvRegister
import kotlinx.android.synthetic.main.activity_registration.*
import kotlinx.android.synthetic.main.activity_registrationactivity.*

class Registrationactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrationactivity)
        val onClickListener: Any = tvRegister.setOnClickListener {
            var FirstName: = etfirstname.text.toString()
            var Password = etPassword.text.toString()
            var LastName = etlastname.text.toString()
            var PhoneNumber = etphonenumber.text.toString()
            var ConfirmPassword = etPassword.text.toString()
            Toast.makeText(baseContext, Password, Toast.LENGTH_LONG).show()

        }
    }
}