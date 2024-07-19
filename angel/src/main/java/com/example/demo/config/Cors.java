package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors implements WebMvcConfigurer {


        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:63342") // Permitir solicitudes desde este origen
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                    .allowedHeaders("*"); // Encabezados permitidos
        }
    }
    /*Esta clase configura el CORS (Cross-Origin Resource Sharing) para la aplicación Spring. Permite solicitudes
    desde http://localhost:63342 y permite métodos HTTP como GET, POST, PUT y DELETE desde cualquier encabezado.
    Esta clase configura el CORS (Cross-Origin Resource Sharing) para la aplicación Spring. Permite solicitudes desde http://localhost:63342 y permite métodos HTTP como GET, POST, PUT y DELETE desde cualquier encabezado.
     */

