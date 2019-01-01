package com.haoijia.manpro.api

import com.haoijia.manpro.mvp.model.bean.LoginForm
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ManproService{

    @FormUrlEncoded
    @POST("admin/login")
    fun login(@Field("username") username:String  ,@Field("password")  password:String ): Observable<LoginForm>
}