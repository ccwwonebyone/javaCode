package com.haoijia.manpro.mvp.model.bean

import io.reactivex.Observable


data class LoginForm(var res: Boolean,
                     var code: Int,
                     var message:String)