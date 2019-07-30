package com.example.tasks

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.tasks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var model: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        model = ViewModelProviders.of(this).get(ViewModel::class.java)
        dataBinding.vm = model

        model.data.observe(this, Observer<Data> {
            Log.d("---->", it.name.get() ?: "")
        })
    }
}
