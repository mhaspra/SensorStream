package ch.mhaspra.sensorstream.application.ports

import ch.mhaspra.sensorstream.domain.Endpoint
import ch.mhaspra.sensorstream.domain.Stream

interface StreamRepository {
    fun findAll() : List<Stream>

    fun save(stream: Stream)
}