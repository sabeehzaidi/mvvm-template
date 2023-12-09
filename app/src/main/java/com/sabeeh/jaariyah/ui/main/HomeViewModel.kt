package com.sabeeh.jaariyah.ui.main

import android.widget.TextView
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    fun setTitle(textView: TextView, text: String) {
        textView.text = text
    }
}