package ch.mhaspra.sensorstream.application.usecases.endpoints

import ch.mhaspra.sensorstream.application.testrepositories.TestEndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class ListEndpointsUseCaseTest {
    @Test
    fun listAllEndpoints_empty() {

        val listEndpointsUseCase = ListEndpointsUseCase(TestEndpointRepository())

        val result : MutableList<Endpoint> = mutableListOf()
        listEndpointsUseCase.invoke { result.addAll(it) }

        assertEquals(0, result.size)
    }

    @Test
    fun listAllEndpoints_one_entry() {

        val endpoint = Endpoint("name", "url")
        val endpointRepository = TestEndpointRepository()
        endpointRepository.save(endpoint)

        val listEndpointsUseCase = ListEndpointsUseCase(endpointRepository)

        val result : MutableList<Endpoint> = mutableListOf()
        listEndpointsUseCase.invoke { result.addAll(it) }

        assertEquals(1, result.size)
        assertEquals(endpoint.name, result[0].name)
        assertEquals(endpoint.url,result[0].url)
    }

    @Test
    fun listAllEndpoints_multiple_entries() {

        val endpointRepository = TestEndpointRepository()
        endpointRepository.save(Endpoint("e1", "url1"))
        endpointRepository.save(Endpoint("e2", "url2"))

        val listEndpointsUseCase = ListEndpointsUseCase(endpointRepository)

        val result : MutableList<Endpoint> = mutableListOf()
        listEndpointsUseCase.invoke { result.addAll(it) }

        assertEquals(2, result.size)
        assertNotEquals(result[0], result[1])
    }
}