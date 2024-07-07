package com.bbva.acgr.cambiodivisas.service;

import com.bbva.acgr.cambiodivisas.model.rest.CambioDivisasResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author Aura Cristina Garzon Rodríguez
 * @since 3 Julio 2024 11:03 AM
 */


@Service
public class CambioDivisasServiceImpl implements CambioDivisasService {

    private final WebClient webClient;

    /**
     * @author Aura Cristina Garzon Rodríguez
     * @param webClient
     */

    public CambioDivisasServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    /**
     * @author Aura Cristina Garzon Rodríguez
     * @since 3 Julio 2024 11:03 AM
     * @param apiKey la clave de API requerida para realizar la solicitud
     * @return
     */

    @Override
    public Mono<CambioDivisasResponse> getLatestRates(String apiKey) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/rates/latest")
                        .queryParam("apikey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(CambioDivisasResponse.class);
    }
}
