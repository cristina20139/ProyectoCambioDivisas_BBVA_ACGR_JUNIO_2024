package com.bbva.acgr.cambiodivisas.model.rest;

import java.util.Map;

/**
 * @author Aura Cristina Garzon Rodriguez (auragarzonr@gmail.com)
 * @since 7 Julio 2024
 */

public class SupportedCurrencies {

    private Map<String, Currency> supportedCurrenciesMap;

    // Getters and setters
    public Map<String, Currency> getSupportedCurrenciesMap() {
        return supportedCurrenciesMap;
    }

    public void setSupportedCurrenciesMap(Map<String, Currency> supportedCurrenciesMap) {
        this.supportedCurrenciesMap = supportedCurrenciesMap;
    }

    public static class Currency {
        private String currencyCode;
        private String currencyName;
        private String countryCode;
        private String countryName;
        private String status;
        private String availableFrom;
        private String availableUntil;
        private String icon;

        // Getters and setters
        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getCurrencyName() {
            return currencyName;
        }

        public void setCurrencyName(String currencyName) {
            this.currencyName = currencyName;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAvailableFrom() {
            return availableFrom;
        }

        public void setAvailableFrom(String availableFrom) {
            this.availableFrom = availableFrom;
        }

        public String getAvailableUntil() {
            return availableUntil;
        }

        public void setAvailableUntil(String availableUntil) {
            this.availableUntil = availableUntil;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
