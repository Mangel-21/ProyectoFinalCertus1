
package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public boolean validarCredenciales(String username, String password) {
        Usuario usuario = usuarioRepository.findByUsernameAndPassword(username, password);
        return usuario != null;
    }
}
