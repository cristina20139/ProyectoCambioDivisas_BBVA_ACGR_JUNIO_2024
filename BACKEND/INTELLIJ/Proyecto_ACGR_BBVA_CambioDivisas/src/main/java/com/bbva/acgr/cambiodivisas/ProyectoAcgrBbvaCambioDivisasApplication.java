package com.bbva.acgr.cambiodivisas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal para la aplicación de Spring Boot que maneja el cambio de divisas.
 *
 * <p>Esta clase inicializa y arranca la aplicación Spring Boot, configurando todos los componentes
 * necesarios para el correcto funcionamiento del sistema de cambio de divisas.</p>
 *
 * <p>Ejemplo de uso:</p>
 * <pre>
 * public static void main(String[] args) {
 *     SpringApplication.run(ProyectoAcgrBbvaCambioDivisasApplication.class, args);
 * }
 * </pre>
 *
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @Since 3 Julio 2024 5:51 AM
 */
@SpringBootApplication
public class ProyectoAcgrBbvaCambioDivisasApplication {

	/**
	 * Método principal que arranca la aplicación Spring Boot.
	 *
	 * @param args los argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProyectoAcgrBbvaCambioDivisasApplication.class, args);
	}
}
