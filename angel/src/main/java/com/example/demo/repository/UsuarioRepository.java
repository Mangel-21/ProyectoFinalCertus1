
package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

    Usuario  findByUsernameAndPassword  (String username, String password);
}
/*Esta interfaz extiende JpaRepository y proporciona métodos para realizar operaciones CRUD en la
entidad Usuario. Define métodos personalizados para encontrar un usuario por nombre de usuario y por nombre de usuario y contraseña.
 */
