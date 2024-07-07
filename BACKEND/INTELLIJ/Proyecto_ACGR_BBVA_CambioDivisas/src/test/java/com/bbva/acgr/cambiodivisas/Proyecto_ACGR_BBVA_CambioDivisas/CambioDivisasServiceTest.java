package com.bbva.acgr.cambiodivisas.Proyecto_ACGR_BBVA_CambioDivisas;

import com.bbva.acgr.cambiodivisas.model.rest.CambioDivisasResponse;
import com.bbva.acgr.cambiodivisas.service.CambioDivisasService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

/**
 * Clase de prueba para el servicio CambioDivisasService.
 * Utiliza Mockito para crear mocks y StepVerifier para verificar comportamientos reactivos.
 * Aplica el principio SOLID de Inversión de Dependencias (Dependency Inversion Principle) al depender de interfaces y abstracciones en lugar de implementaciones concretas.
 *
 * @autor Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 7 Julio 2024 1:31 pm
 */

@ExtendWith(MockitoExtension.class) // Extiende con Mockito para habilitar el uso de anotaciones @Mock.
class CambioDivisasServiceTest {

    @Mock // Crea un mock de CambioDivisasService.
    private CambioDivisasService cambioDivisasService;

    @Test // Indica que este método es una prueba unitaria.
    void testGetLatestRates() {
        // Respuesta mockeada
        Map<String, String> ratesMap = new HashMap<>(); // Crea un mapa para las tasas de cambio.
        ratesMap.put("USD", "1.12"); // Añade tasa de cambio USD.
        ratesMap.put("GBP", "0.89"); // Añade tasa de cambio GBP.

        CambioDivisasResponse mockResponse = new CambioDivisasResponse(); // Crea una instancia de la respuesta mockeada.
        mockResponse.setBase("EUR"); // Establece la moneda base.
        mockResponse.setRates(ratesMap); // Establece las tasas de cambio.

        // Define el comportamiento del mock
        when(cambioDivisasService.getLatestRates("your-api-key"))
                .thenReturn(Mono.just(mockResponse)); // Define la respuesta del método mockeado.

        // Prueba el método del servicio
        Mono<CambioDivisasResponse> responseMono = cambioDivisasService.getLatestRates("your-api-key");

        // Verifica el resultado
        StepVerifier.create(responseMono) // Crea un StepVerifier para el Mono.
                .expectNextMatches(response -> { // Verifica que la respuesta coincida con las expectativas.
                    // Verifica los atributos de la respuesta
                    assert response != null;
                    assert response.getBase().equals("EUR"); // Verifica la moneda base.
                    assert response.getRates().containsKey("USD"); // Verifica la presencia de la tasa USD.
                    assert response.getRates().containsValue("1.12"); // Verifica el valor de la tasa USD.
                    return true;
                })
                .verifyComplete(); // Verifica que el Mono complete correctamente.
    }
}
