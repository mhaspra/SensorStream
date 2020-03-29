package ch.mhaspra.sensorstream.application.usecases.endpoints

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint

class ListEndpointsUseCase(private val endpointRepository : EndpointRepository) {

    fun invoke(endpointsPresenter: (List<Endpoint>) -> Unit) {
        endpointsPresenter(
            endpointRepository.findAll()
        )
    }
}