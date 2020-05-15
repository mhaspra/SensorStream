package ch.mhaspra.sensorstream.application.testrepositories

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint

class TestEndpointRepository : EndpointRepository {
    private val endpoints: MutableList<Endpoint> = mutableListOf()

    override fun findAll(): List<Endpoint> {
        return endpoints
    }

    override fun save(endpoint: Endpoint) {
        endpoints.add(endpoint)
    }
}