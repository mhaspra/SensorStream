package ch.mhaspra.sensorstream.adapters.persistence.inmemory

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.application.ports.StreamRepository
import ch.mhaspra.sensorstream.domain.Endpoint
import ch.mhaspra.sensorstream.domain.Stream

class InMemoryStreamRepository : StreamRepository {
    private val streams : MutableList<Stream> = mutableListOf(
        Stream("Dummy Stream 1"),
        Stream("Dummy Stream 2")
    )

    override fun findAll(): List<Stream> {
        return streams
    }

    override fun save(stream: Stream) {
        streams.add(stream)
    }

}