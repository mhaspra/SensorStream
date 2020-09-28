package ch.mhaspra.sensorstream.application.usecases.streams

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.application.ports.StreamRepository
import ch.mhaspra.sensorstream.domain.Endpoint
import ch.mhaspra.sensorstream.domain.Stream

class ListStreamsUseCase(private val streamRepository : StreamRepository) {

    fun invoke(streamsPresenter: (List<Stream>) -> Unit) {
        streamsPresenter(
            streamRepository.findAll()
        )
    }
}