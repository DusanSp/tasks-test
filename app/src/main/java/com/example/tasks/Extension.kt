package com.example.tasks

import android.content.Context
import android.content.Intent

inline fun <reified ActivityClassT> Context.navigateToActivity() =
    startActivity(Intent(this, ActivityClassT::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
