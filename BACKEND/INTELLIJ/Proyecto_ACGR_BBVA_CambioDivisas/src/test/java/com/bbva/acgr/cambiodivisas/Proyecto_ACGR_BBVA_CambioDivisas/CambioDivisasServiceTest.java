package com.bbva.acgr.cambiodivisas.Proyecto_ACGR_BBVA_CambioDivisas;

import com.bbva.acgr.cambiodivisas.model.CambioDivisasResponse;
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

@ExtendWith(MockitoExtension.class)
class CambioDivisasServiceTest {

    @Mock
    private CambioDivisasService cambioDivisasService;

    @Test
    void testGetLatestRates() {
        // Mock response
        Map<String, String> ratesMap = new HashMap<>();
        ratesMap.put("USD", "1.12");
        ratesMap.put("GBP", "0.89");

        CambioDivisasResponse mockResponse = new CambioDivisasResponse();
        mockResponse.setBase("EUR");
        mockResponse.setRates(ratesMap);

        // Define mock behavior
        when(cambioDivisasService.getLatestRates("your-api-key"))
                .thenReturn(Mono.just(mockResponse));

        // Test the service method
        Mono<CambioDivisasResponse> responseMono = cambioDivisasService.getLatestRates("your-api-key");

        // Verify the result
        StepVerifier.create(responseMono)
                .expectNextMatches(response -> {
                    // Verify the response attributes
                    assert response != null;
                    assert response.getBase().equals("EUR");
                    assert response.getRates().containsKey("USD");
                    assert response.getRates().containsValue("1.12");
                    return true;
                })
                .verifyComplete();
    }
}
