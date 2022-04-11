package com.example.raspblockcontrol.view.activity

import com.example.raspblockcontrol.R
import com.example.raspblockcontrol.base.BaseActivity
import com.example.raspblockcontrol.presenter.StartActivityPresenter
import com.example.raspblockcontrol.presenter.StartActivityPresenterImpl0

class MainActivity : BaseActivity() {

    private lateinit var mPresenter: StartActivityPresenter
    private val DURATION:Long = 3000

    override fun initLayoutInflater(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
    }

    override fun initData() {
        mPresenter = StartActivityPresenterImpl0(this)
        mPresenter.wait(DURATION)
    }

    fun getIntoConnectActivity(){
        ConnectActivity.startActClearTop(this)
    }

}