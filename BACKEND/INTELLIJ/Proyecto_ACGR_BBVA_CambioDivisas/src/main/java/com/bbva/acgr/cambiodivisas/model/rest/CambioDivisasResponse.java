package com.bbva.acgr.cambiodivisas.model.rest;

import java.util.Map;

/**
 * Representa la respuesta de tasas de cambio de divisas.
 *
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 3 Julio 2024
 */
public class CambioDivisasResponse {
    private String base;
    private Map<String, String> rates;

    /**
     * Obtiene la moneda base para la tasa de cambio.
     *
     * @return la moneda base
     */
    public String getBase() {
        return base;
    }

    /**
     * Establece la moneda base para la tasa de cambio.
     *
     * @param base la moneda base a establecer
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * Obtiene las tasas de cambio respecto a la moneda base.
     *
     * @return un mapa de tasas de cambio
     */
    public Map<String, String> getRates() {
        return rates;
    }

    /**
     * Establece las tasas de cambio.
     *
     * @param rates el mapa de tasas de cambio a establecer
     */
    public void setRates(Map<String, String> rates) {
        this.rates = rates;
    }
}
