package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        Usuario usuario = usuarioService.findByUsername(username);
        Map<String, Object> response = new HashMap<>();

        if (usuario != null && usuario.getPassword().equals(password)) {
            response.put("success", true);
            return ResponseEntity.ok(response);
        } else {
            response.put("success", false);
            response.put("message", "Usuario o contraseña incorrectos");
            return ResponseEntity.status(401).body(response);
        }
    }
}
/*este controlador maneja las solicitudes de inicio de sesión. Verifica las credenciales del usuario enviadas en la
solicitud y responde con éxito si coinciden, de lo contrario, devuelve un error 401.
 */
