package com.haoijia.manpro.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.haoijia.manpro.R
import com.haoijia.manpro.api.Manpro
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login()
    }
    fun login(){
        loginBtn.setOnClickListener {
            val phone: String = phoneInput.text.toString()
            val password: String = passwordInput.text.toString()
            Manpro.service.login(phone, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        LoginForm ->
                        if(LoginForm.code != 200){
                            Toast.makeText(this,LoginForm.message, Toast.LENGTH_SHORT).show()
                        }
                        Log.d("test",LoginForm.toString())
                    },
                    {
                        error->
                        Log.d("Erroe", error.message)
                    }
                )
        }
    }
}
