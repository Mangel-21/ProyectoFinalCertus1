/*package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")

@CrossOrigin(origins = "http://localhost:63342")
public class UserController {



        @Autowired
        private UsuarioService usuarioService;
        @GetMapping("/lista")
        public List<Usuario> list() {


        return usuarioService.list();
        }
        @GetMapping("/{username}")
        public ResponseEntity<Usuario> getUsuarioByUsername(@PathVariable String username) {
            Usuario usuario = usuarioService.findByUsername(username);
            if (usuario != null) {
                return ResponseEntity.ok(usuario);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PostMapping
        public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
            Usuario nuevoUsuario = usuarioService.saveUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
            usuarioService.deleteUsuario(id);
            return ResponseEntity.noContent().build();
        }

    @PostMapping(value="/logintest", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> loginUsuario(@RequestBody Usuario usuario) {
        boolean loginExitoso = usuarioService.validarCredenciales(usuario.getUsername(), usuario.getPassword());
        if (loginExitoso) {
            return ResponseEntity.ok("Inicio de sesión exitoso para el usuario: " + usuario.getUsername());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
}*/
