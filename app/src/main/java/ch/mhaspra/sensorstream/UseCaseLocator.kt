package ch.mhaspra.sensorstream

import ch.mhaspra.sensorstream.adapters.persistence.inmemory.InMemoryEndpointRepository
import ch.mhaspra.sensorstream.adapters.persistence.inmemory.InMemoryStreamRepository
import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.application.ports.StreamRepository
import ch.mhaspra.sensorstream.application.usecases.endpoints.AddEndpointUseCase
import ch.mhaspra.sensorstream.application.usecases.endpoints.ListEndpointsUseCase
import ch.mhaspra.sensorstream.application.usecases.streams.ListStreamsUseCase

object UseCaseLocator {
    private val endpointRepository : EndpointRepository = InMemoryEndpointRepository()
    private val streamRepository : StreamRepository = InMemoryStreamRepository()

    fun getListEndpointsUseCase() : ListEndpointsUseCase = ListEndpointsUseCase(endpointRepository)

    fun getAddEndpointUseCase() : AddEndpointUseCase = AddEndpointUseCase(endpointRepository)

    fun getListStreamsUseCase() : ListStreamsUseCase = ListStreamsUseCase(streamRepository)
}