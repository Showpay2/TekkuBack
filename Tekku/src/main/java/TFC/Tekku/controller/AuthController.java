package com.tekku.controller;

import com.tekku.security.JwtUtil;
import com.tekku.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String contraseña) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(correo, contraseña));
        UserDetails userDetails = userDetailsService.loadUserByUsername(correo);
        String rol = userDetails.getAuthorities().iterator().next().getAuthority().replace("ROLE_", "");
        return jwtUtil.generateToken(correo, rol);
    }
}
``