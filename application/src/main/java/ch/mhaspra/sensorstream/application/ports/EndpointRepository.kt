package ch.mhaspra.sensorstream.application.ports

import ch.mhaspra.sensorstream.domain.Endpoint

interface EndpointRepository {
    fun findAll() : List<Endpoint>
}