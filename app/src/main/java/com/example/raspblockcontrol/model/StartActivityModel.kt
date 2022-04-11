package com.example.raspblockcontrol.model

import com.example.raspblockcontrol.presenter.StartActivityPresenter

interface StartActivityModel {
    var mPresenter:StartActivityPresenter

    fun getIntoConnectActivity()

    fun wait(dur:Long?)
}