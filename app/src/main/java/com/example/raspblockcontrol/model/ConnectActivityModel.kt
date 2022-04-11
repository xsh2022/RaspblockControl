package com.example.raspblockcontrol.model

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.example.raspblockcontrol.presenter.ConnectActivityPresenter


class ConnectActivityModel(private var mPresenter:ConnectActivityPresenter) {

    private lateinit var IPAddress: String
    private lateinit var port: String
    private lateinit var username: String
    private lateinit var password: String

    fun requestToConn(IPAddress:String, port:String, username:String, password:String){

    }

    fun requestFail(reason:Int){
        mPresenter.sendFailureSignal(reason)
    }

    fun requestSuccess(info: Bundle){
        mPresenter.sendSuccessSignal(info)
    }

    fun isConnectionInfoLegal(IPAddress: String, port: String, username: String, password: String):Boolean{
        //TODO: Logy for check
        return true
    }

    private val mHandler = @SuppressLint("HandlerLeak")
    object : Handler(){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)


        }
    }

    companion object {
        val IP_NOT_FOUND = 1
        val PORT_NOT_FOUND = 2
        val USERINFO_NOT_MATCH = 3
        val THREAD_OVERTIME = 4
    }
}