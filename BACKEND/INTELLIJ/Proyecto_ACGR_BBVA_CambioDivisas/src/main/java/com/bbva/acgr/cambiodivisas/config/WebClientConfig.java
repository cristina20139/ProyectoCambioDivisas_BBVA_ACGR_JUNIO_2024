package com.bbva.acgr.cambiodivisas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Clase de configuración para el WebClient.
 * <p>
 * Esta clase configura un bean de WebClient con una URL base para realizar solicitudes a la API externa de Currency Freaks.
 * </p>
 * <p>
 * <b>Principio SOLID aplicado:</b> Single Responsibility Principle (SRP).
 * Esta clase tiene una única responsabilidad que es la configuración del WebClient.
 * </p>
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 3 Julio 2024
 */
@Configuration
public class WebClientConfig {

    /**
     * Configura un bean de WebClient.
     * <p>
     * Este método configura un WebClient.Builder con la URL base de la API de Currency Freaks y devuelve una instancia de WebClient.
     * </p>
     * <p>
     * <b>Principio SOLID aplicado:</b> Single Responsibility Principle (SRP).
     * Este método tiene una única responsabilidad que es crear y configurar el bean de WebClient.
     * </p>
     *
     * @param builder el constructor de WebClient proporcionado por Spring
     * @return una instancia configurada de WebClient
     */
    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("https://api.currencyfreaks.com/v2.0").build();
    }
}
