package ch.mhaspra.sensorstream.ui.endpoints

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ch.mhaspra.sensorstream.adapters.persistence.inmemory.InMemoryEndpointRepository
import ch.mhaspra.sensorstream.application.usecases.endpoints.ListEndpointsUseCase
import ch.mhaspra.sensorstream.domain.Endpoint

class EndpointsViewModel : ViewModel() {

    private val _endpoints = MutableLiveData<List<Endpoint>>().apply {
        ListEndpointsUseCase(InMemoryEndpointRepository()).invoke {
            value = it
        }
    }
    val endpoints: LiveData<List<Endpoint>> = _endpoints
}