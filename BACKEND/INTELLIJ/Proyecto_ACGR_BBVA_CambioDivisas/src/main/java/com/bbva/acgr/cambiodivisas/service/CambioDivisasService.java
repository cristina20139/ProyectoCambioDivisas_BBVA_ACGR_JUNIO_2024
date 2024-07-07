package com.bbva.acgr.cambiodivisas.service;

import com.bbva.acgr.cambiodivisas.model.rest.CambioDivisasResponse;
import reactor.core.publisher.Mono;

/**
 * Interfaz que define el servicio para obtener las tasas de cambio más recientes.
 * Implementaciones deben proporcionar la lógica para obtener estas tasas.
 *
 * @author Aura Cristina Garzón Rodríguez
 * @since 3 de Julio de 2024
 */
public interface CambioDivisasService {

    /**
     * Obtiene las tasas de cambio más recientes utilizando un API key específico.
     *
     * @param apiKey la clave de API requerida para realizar la solicitud
     * @return un Mono que emite la respuesta de tasas de cambio
     */
    Mono<CambioDivisasResponse> getLatestRates(String apiKey);
}
