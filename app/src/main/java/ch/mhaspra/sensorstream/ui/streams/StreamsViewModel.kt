package ch.mhaspra.sensorstream.ui.streams

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ch.mhaspra.sensorstream.UseCaseLocator
import ch.mhaspra.sensorstream.domain.Endpoint
import ch.mhaspra.sensorstream.domain.Stream

class StreamsViewModel : ViewModel() {

    private val _streams = MutableLiveData<List<Stream>>().apply {
        UseCaseLocator.getListStreamsUseCase().invoke {
            value = it
        }
    }
    val streams: LiveData<List<Stream>> = _streams
}