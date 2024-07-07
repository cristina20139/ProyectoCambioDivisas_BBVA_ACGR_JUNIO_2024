package com.bbva.acgr.cambiodivisas.model.persistence;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Data Transfer Object (DTO) para representar la entidad CambioDivisas.
 * <p>
 * Esta clase se utiliza para transferir datos entre las diferentes capas de la aplicación.
 * </p>
 * <p>
 * Implementa el principio SOLID de Responsabilidad Única (Single Responsibility Principle - SRP),
 * ya que su única responsabilidad es encapsular los datos relacionados con un cambio de divisas.
 * </p>
 *
 * @autor Aura Cristina Garzón Rodríguez
 * @since 7 de Julio de 2024, 6:11 pm
 */
public class CambioDivisasDTO {

    private Date date_query;
    private String rate;
    private BigDecimal value;
    private String rate_base;
    private Integer id;

    /**
     * Obtiene la fecha de la consulta.
     *
     * @return la fecha de la consulta
     */
    public Date getDate_query() {
        return date_query;
    }

    /**
     * Establece la fecha de la consulta.
     *
     * @param date_query la fecha de la consulta a establecer
     */
    public void setDate_query(Date date_query) {
        this.date_query = date_query;
    }

    /**
     * Obtiene la tasa de cambio.
     *
     * @return la tasa de cambio
     */
    public String getRate() {
        return rate;
    }

    /**
     * Establece la tasa de cambio.
     *
     * @param rate la tasa de cambio a establecer
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * Obtiene el valor de la tasa de cambio.
     *
     * @return el valor de la tasa de cambio
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Establece el valor de la tasa de cambio.
     *
     * @param value el valor de la tasa de cambio a establecer
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene la tasa base.
     *
     * @return la tasa base
     */
    public String getRate_base() {
        return rate_base;
    }

    /**
     * Establece la tasa base.
     *
     * @param rate_base la tasa base a establecer
     */
    public void setRate_base(String rate_base) {
        this.rate_base = rate_base;
    }

    /**
     * Obtiene el identificador único.
     *
     * @return el identificador único
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único.
     *
     * @param id el identificador único a establecer
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
