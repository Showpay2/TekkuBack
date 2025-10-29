package com.tekku.controller;

import com.tekku.dto.UsuarioDTO;
import com.tekku.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioService.obtenerTodos();
    }

    @GetMapping("/{correo}")
    public UsuarioDTO obtenerPorCorreo(@PathVariable String correo) {
        return usuarioService.obtenerPorCorreo(correo);
    }

    @PostMapping("/crear")
    @PreAuthorize("hasRole('JEFE')")
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioDTO dto) {
        Usuario nuevo = new Usuario();
        nuevo.setNombre(dto.getNombre());
        nuevo.setCorreo(dto.getCorreo());
        nuevo.setContraseña(passwordEncoder.encode("contraseñaTemporal")); // o generar aleatoria
        nuevo.setRol(Usuario.Rol.valueOf(dto.getRol()));
        usuarioRepository.save(nuevo);
        return ResponseEntity.ok("Usuario creado");
    }


}