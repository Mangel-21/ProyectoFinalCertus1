
package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

    // Getters y setters
}
/*Esta clase representa la entidad Usuario para la base de datos. Utiliza anotaciones de JPA para definir la tabla y
las columnas, y Lombok para generar automáticamente getters, setters y constructores.
 */
