package ch.mhaspra.sensorstream.application.usecases.endpoints

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint

class AddEndpointUseCase(private val endpointRepository : EndpointRepository) {
    fun invoke(name: String?, url: String?) {
        endpointRepository.save(Endpoint(name!!, url!!))
    }
}