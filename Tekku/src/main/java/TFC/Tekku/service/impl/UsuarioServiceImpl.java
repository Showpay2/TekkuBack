IMPLEMENTACION:
        package com.tekku.service.impl;

import com.tekku.dto.UsuarioDTO;
import com.tekku.model.Usuario;
import com.tekku.repository.UsuarioRepository;
import com.tekku.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioDTO> obtenerTodos() {
        return usuarioRepository.findAll().stream().map(this::convertirADTO).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO obtenerPorCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo).map(this::convertirADTO).orElse(null);
    }

    private UsuarioDTO convertirADTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNombre(usuario.getNombre());
        dto.setCorreo(usuario.getCorreo());
        dto.setRol(usuario.getRol().name());
        return dto;
    }
}