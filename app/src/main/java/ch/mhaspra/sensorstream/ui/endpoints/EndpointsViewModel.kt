package ch.mhaspra.sensorstream.ui.endpoints

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EndpointsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Available endpoints"
    }
    val text: LiveData<String> = _text
}