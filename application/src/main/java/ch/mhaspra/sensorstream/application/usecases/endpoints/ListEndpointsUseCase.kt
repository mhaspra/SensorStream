package ch.mhaspra.sensorstream.application.usecases.endpoints

import ch.mhaspra.sensorstream.domain.Endpoint

class ListEndpointsUseCase {
    fun invoke(endpointsPresenter: (List<Endpoint>) -> Unit) {
        endpointsPresenter(
            listOf<Endpoint>(
                Endpoint("Dummy Endpoint 1", "https://dummy1"),
                Endpoint("Dummy Endpoint 2", "https://dummy2"),
                Endpoint("Dummy Endpoint 3", "https://dummy3"),
                Endpoint("Dummy Endpoint 4", "https://dummy4"),
                Endpoint("Dummy Endpoint 5", "https://dummy5"),
                Endpoint("Dummy Endpoint 6", "https://dummy6"),
                Endpoint("Dummy Endpoint 7", "https://dummy7"),
                Endpoint("Dummy Endpoint 8", "https://dummy8"),
                Endpoint("Dummy Endpoint 9", "https://dummy9"),
                Endpoint("Dummy Endpoint 10", "https://dummy10"),
                Endpoint("Dummy Endpoint 11", "https://dummy11"),
                Endpoint("Dummy Endpoint 12", "https://dummy12"),
                Endpoint("Dummy Endpoint 13", "https://dummy13"),
                Endpoint("Dummy Endpoint 14", "https://dummy14"),
                Endpoint("Dummy Endpoint 15", "https://dummy15"),
                Endpoint("Dummy Endpoint 16", "https://dummy16"),
                Endpoint("Dummy Endpoint 17", "https://dummy17"),
                Endpoint("Dummy Endpoint 18", "https://dummy18"),
                Endpoint("Dummy Endpoint 19", "https://dummy19"),
                Endpoint("Dummy Endpoint 20", "https://dummy20")
            )
        )
    }
}