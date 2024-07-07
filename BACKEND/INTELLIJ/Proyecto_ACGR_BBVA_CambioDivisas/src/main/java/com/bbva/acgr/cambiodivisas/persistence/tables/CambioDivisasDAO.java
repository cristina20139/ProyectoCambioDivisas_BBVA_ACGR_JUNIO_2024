package com.bbva.acgr.cambiodivisas.persistence.tables;

import com.bbva.acgr.cambiodivisas.model.persistence.CambioDivisasDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * DAO (Data Access Object) para la entidad CambioDivisas.
 * <p>
 * Este DAO proporciona métodos para realizar operaciones CRUD en la base de datos para la entidad {@link CambioDivisasDTO}.
 * </p>
 * <p>
 * Implementa el principio SOLID de Inversión de Dependencias (Dependency Inversion Principle - DIP),
 * ya que depende de la abstracción {@link JdbcTemplate} en lugar de una concreción.
 * </p>
 *
 * @see CambioDivisasDTO
 * @see JdbcTemplate
 *
 * @autor Aura Cristina Garzón Rodríguez
 * @since 7 de Julio de 2024, 6:09 pm
 */
@Component
public class CambioDivisasDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Inserta un registro de cambio de divisas en la base de datos.
     * <p>
     * Este método toma un objeto {@link CambioDivisasDTO} y lo inserta en la tabla "cambio_divisas".
     * </p>
     *
     * @param cambioDivisasDTO el objeto {@link CambioDivisasDTO} que contiene la información a insertar
     */
    public void insert(CambioDivisasDTO cambioDivisasDTO) {
        String sql = "INSERT INTO cambio_divisas (date_query, rate, value, rate_base, id) " +
                "VALUES (?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                cambioDivisasDTO.getDate_query(),
                cambioDivisasDTO.getRate(),
                cambioDivisasDTO.getValue(),
                cambioDivisasDTO.getRate_base(),
                cambioDivisasDTO.getId()
        );
    }
}
