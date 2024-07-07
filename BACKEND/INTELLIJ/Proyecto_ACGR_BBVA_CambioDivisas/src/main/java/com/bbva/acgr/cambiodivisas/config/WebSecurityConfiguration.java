package com.bbva.acgr.cambiodivisas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @Since 7 Julio 2024 12:33 PM
 */

@Configuration // Marca esta clase como una clase de configuración para Spring.
@EnableWebSecurity // Habilita la seguridad web para la aplicación.
public class WebSecurityConfiguration {

    @Bean // Indica que este método devuelve un bean de Spring.
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Deshabilita la protección CSRF, común en APIs REST sin estado.
                .authorizeRequests(authorize -> authorize
                        .anyRequest().authenticated() // Asegura que todas las solicitudes estén autenticadas.
                )
                .httpBasic(withDefaults()) // Habilita la autenticación HTTP Basic con configuraciones predeterminadas.
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // Configura la gestión de sesiones para ser sin estado.
        return http.build(); // Construye y devuelve el SecurityFilterChain.
    }
}
