package com.haoijia.manpro.api

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Interceptor
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object Manpro {
    var baseUrl: String = "https://manpro.haoijia.com"

    private val retrofit: Retrofit
    private val okHttpClient: OkHttpClient
    private val DEFAULT_TIMEOUT = 5L

    init {
        val longging = Interceptor { chain ->
            val request = chain.request()
            Log.d("okhttp", "okhttp--->" + request.url().toString())
            chain.proceed(request)
        }

        okHttpClient = OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(longging)
            .addInterceptor(addHeaderInterceptor())
            .build()

        val gson: Gson = GsonBuilder().setLenient().create()

        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    private fun addHeaderInterceptor(): Interceptor{
        return Interceptor { chain ->
            val headerRequest = chain.request()
            var requestBuilder = headerRequest.newBuilder()
                .header("Accept", "application/json, text/plain, */*")
            val request = requestBuilder.build()
            chain.proceed(request)
        }
    }

    val service: ManproService by lazy { retrofit.create(ManproService::class.java) }
}