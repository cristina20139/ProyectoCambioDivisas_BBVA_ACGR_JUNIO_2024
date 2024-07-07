package com.bbva.acgr.cambiodivisas.controller;

import com.bbva.acgr.cambiodivisas.model.rest.CambioDivisasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.acgr.cambiodivisas.service.CambioDivisasService;
import reactor.core.publisher.Mono;

/**
 * Servicio Web externo que se esta probando https://api.currencyfreaks.com/v2.0/rates/latest?apikey=bde53f3076204fa9b4bc3e16c3b3324c
 *
 * Controlador REST para manejar las solicitudes relacionadas con tasas de cambio de divisas.
 * <p>
 * Este controlador maneja las solicitudes GET para obtener las tasas de cambio más recientes desde el servicio de CurrencyService.
 * </p>
 * <p>
 * <b>Principio SOLID aplicado:</b>
 * <ul>
 *     <li>Single Responsibility Principle (SRP): La clase tiene una única responsabilidad, que es manejar las solicitudes relacionadas con tasas de cambio de divisas.</li>
 * </ul>
 * </p>
 *
 * @author Aura Cristina Garzon Rodriguez (auragarzonr@gmail.com)
 * @since 3 Julio 2024
 */
@RestController
public class CambioDivisasController {


    private static final Logger logger = LoggerFactory.getLogger(CambioDivisasController.class);

    private final CambioDivisasService currencyService;

    /**
     * Constructor del controlador que inyecta una instancia de CurrencyService.
     *
     * @param currencyService servicio utilizado para obtener las tasas de cambio de divisas
     */
    @Autowired
    public CambioDivisasController(CambioDivisasService currencyService) {
        this.currencyService = currencyService;
    }

    /**
     * Servicio Externo consultado : https://api.currencyfreaks.com/v2.0/rates/latest?apikey=bde53f3076204fa9b4bc3e16c3b3324c
     * Maneja la solicitud GET para obtener las tasas de cambio más recientes.
     *
     * @return un Mono que emite una CurrencyResponse que contiene las tasas de cambio más recientes
     */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/latest-rates")
    public Mono<CambioDivisasResponse> getLatestRates() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
        return currencyService.getLatestRates("bde53f3076204fa9b4bc3e16c3b3324c");
    }
}
