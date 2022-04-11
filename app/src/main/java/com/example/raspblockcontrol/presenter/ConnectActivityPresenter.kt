package com.example.raspblockcontrol.presenter

import android.os.Bundle
import com.example.raspblockcontrol.model.ConnectActivityModel
import com.example.raspblockcontrol.view.activity.ConnectActivity

class ConnectActivityPresenter(private var mActivity:ConnectActivity) {
    private var mModel = ConnectActivityModel(this)

    fun requestToConn(IPAddress:String, port:String, username:String, password:String){

    }

    fun sendFailureSignal(reason:Int){
        mActivity.requestFail(reason)
    }

    fun sendSuccessSignal(info: Bundle){
        mActivity.requestSuccess(info)
    }

    fun checkIfConnLegal(IPAddress: String, port: String, username: String, password: String):Boolean{
        return mModel.isConnectionInfoLegal(IPAddress, port, username, password)
    }
}