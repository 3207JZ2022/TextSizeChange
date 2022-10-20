package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SizeViewModel : ViewModel (){

    // MutableLiveData<T> can be observed for state change
    private val size : MutableLiveData<Float> = MutableLiveData()

    fun setSize (size: Float) {
        this.size.value = size
    }

    fun getSize(): LiveData<Float> {
        return size
    }
}