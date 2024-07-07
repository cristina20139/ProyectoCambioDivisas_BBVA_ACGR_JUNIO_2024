package com.bbva.acgr.cambiodivisas.service;

import com.bbva.acgr.cambiodivisas.model.persistence.CambioDivisasDTO;
import com.bbva.acgr.cambiodivisas.persistence.tables.CambioDivisasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Map;
import java.util.Random;

/**
 * Servicio de lógica de negocios para el manejo de cambios de divisas,
 * encargado de registrar la información en la base de datos.
 * <p>
 * Este servicio utiliza {@link CambioDivisasDAO} para interactuar con la capa de persistencia.
 * <p>
 * Implementa el principio SOLID de Inversión de Dependencias (Dependency Inversion Principle - DIP),
 * ya que depende de una abstracción (CambioDivisasDAO) en lugar de una concreción.
 * </p>
 *
 * @see CambioDivisasDAO
 * @see CambioDivisasDTO
 *
 * @autor Aura Cristina Garzón Rodríguez
 * @since 7 de Julio de 2024, 5:14 pm
 */
@Component
public class CambioDivisasLogicaNegociosBDService {

    @Autowired
    CambioDivisasDAO cambioDivisasDAO;

    /**
     * Registra la información de cambio de divisas en la base de datos.
     * <p>
     * Este método toma una tasa base y un mapa de tasas con sus valores correspondientes,
     * y guarda esta información en la base de datos utilizando {@link CambioDivisasDAO}.
     * </p>
     *
     * @param base_rate la tasa base utilizada para el cambio de divisas
     * @param rates     un mapa de tasas y sus valores correspondientes
     */
    public void registrarInformacionenBaseDatos(String base_rate, Map<String, String> rates) {
        Date date_query = new Date(System.currentTimeMillis());
        Random random = new Random(System.currentTimeMillis());
        Integer id = random.nextInt(1000000) + 1;
        for (Map.Entry<String, String> entry : rates.entrySet()) {
            String rate = entry.getKey();
            BigDecimal value = BigDecimal.valueOf(Double.parseDouble(entry.getValue()));
            CambioDivisasDTO cambioDivisasDTO = new CambioDivisasDTO();
            cambioDivisasDTO.setDate_query(date_query);
            cambioDivisasDTO.setRate(rate);
            cambioDivisasDTO.setValue(value);
            cambioDivisasDTO.setRate_base(base_rate);
            cambioDivisasDTO.setId(id);
            System.out.println(cambioDivisasDTO.getRate_base() + " " + cambioDivisasDTO.getRate());
            cambioDivisasDAO.insert(cambioDivisasDTO);
        }
    }
}
