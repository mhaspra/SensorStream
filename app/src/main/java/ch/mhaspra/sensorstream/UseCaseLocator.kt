package ch.mhaspra.sensorstream

import ch.mhaspra.sensorstream.adapters.persistence.inmemory.InMemoryEndpointRepository
import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.application.usecases.endpoints.AddEndpointUseCase
import ch.mhaspra.sensorstream.application.usecases.endpoints.ListEndpointsUseCase

object UseCaseLocator {
    private val endpointRepository : EndpointRepository = InMemoryEndpointRepository()

    fun getListEndpointsUseCase() : ListEndpointsUseCase = ListEndpointsUseCase(endpointRepository)

    fun getAddEndpointUseCase() : AddEndpointUseCase = AddEndpointUseCase(endpointRepository)
}