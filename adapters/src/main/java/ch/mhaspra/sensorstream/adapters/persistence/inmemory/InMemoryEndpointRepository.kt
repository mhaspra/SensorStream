package ch.mhaspra.sensorstream.adapters.persistence.inmemory

import ch.mhaspra.sensorstream.application.ports.EndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint

class InMemoryEndpointRepository : EndpointRepository  {
    private val endpoints : MutableList<Endpoint> = mutableListOf(
        Endpoint("Dummy Endpoint 1", "https://dummy1"),
        Endpoint("Dummy Endpoint 2", "https://dummy2"),
        Endpoint("Dummy Endpoint 3", "https://dummy3"),
        Endpoint("Dummy Endpoint 4", "https://dummy4"),
        Endpoint("Dummy Endpoint 5", "https://dummy5"),
        Endpoint("Dummy Endpoint 6", "https://dummy6"),
        Endpoint("Dummy Endpoint 7", "https://dummy7"),
        Endpoint("Dummy Endpoint 8", "https://dummy8"),
        Endpoint("Dummy Endpoint 9", "https://dummy9"),
        Endpoint("Dummy Endpoint 10", "https://dummy10"))



    override fun findAll(): List<Endpoint> {
        return endpoints
    }

    override fun save(endpoint: Endpoint) {
        endpoints.add(endpoint)
    }


}