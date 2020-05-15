package ch.mhaspra.sensorstream.application.usecases.endpoints

import ch.mhaspra.sensorstream.application.testrepositories.TestEndpointRepository
import ch.mhaspra.sensorstream.domain.Endpoint
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddEndpointUseCaseTest {
    @Test
    fun addEndpoint() {
        val name = "e"
        val url = "u"

        val endpointRepository = TestEndpointRepository()
        val addEndpointsUseCase = AddEndpointUseCase(endpointRepository)

        addEndpointsUseCase.invoke(name, url)

        assertEquals(name, endpointRepository.findAll()[0].name)
        assertEquals(url, endpointRepository.findAll()[0].url)
    }
}