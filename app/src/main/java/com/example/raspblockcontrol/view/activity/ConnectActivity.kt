package com.example.raspblockcontrol.view.activity

import android.content.Intent
import android.os.Bundle
import android.telephony.ims.ImsReasonInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.raspblockcontrol.R
import com.example.raspblockcontrol.base.BaseActivity
import com.example.raspblockcontrol.presenter.ConnectActivityPresenter

class ConnectActivity : BaseActivity() {
    private lateinit var etIPAddress:EditText
    private lateinit var etPort:EditText
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnConnect: Button

    private lateinit var mPresenter:ConnectActivityPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)
    }

    override fun initLayoutInflater(): Int {
        return R.layout.activity_connect
    }

    override fun initView() {
        etIPAddress = findViewById(R.id.et_ip_adr)
        etPort = findViewById(R.id.et_port)
        etUsername = findViewById(R.id.et_username)
        etPassword = findViewById(R.id.et_password)
        btnConnect = findViewById(R.id.btn_conn)

    }

    override fun initData() {
        mPresenter = ConnectActivityPresenter(this)

        btnConnect.setOnClickListener {
            val IPAddress = etIPAddress.text.toString()
            val port = etPort.text.toString()
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if(mPresenter.checkIfConnLegal(IPAddress, port, username, password)){
                mPresenter.requestToConn(IPAddress, port, username, password)
            }
        }
    }

    fun requestFail(reason:Int){
        val explains = arrayOf("IP is not correct","Port is not correct", "Username does not match the password", "Request thread overtime")
        Toast.makeText(this, "Connection error code: $reason\nExplain: ${explains[reason]} ", Toast.LENGTH_SHORT).show()
    }

    fun requestSuccess(info:Bundle){
        ControlActivity.actStart(info, this)
    }

    companion object{
        fun startActClearTop(context:BaseActivity){
            val intent = Intent()
            intent.setClass(context, ConnectActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            context.startActivity(intent)
        }
    }
}