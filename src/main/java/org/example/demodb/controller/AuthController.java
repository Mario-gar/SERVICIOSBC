package org.example.demodb.controller;

import org.example.demodb.dto.AuthRequest;
import org.example.demodb.dto.AuthResponse;
import org.example.demodb.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private org.example.demodb.service.UsuarioDetailsService userDetailsService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        Authentication auth = new UsernamePasswordAuthenticationToken(
                authRequest.getEmail(), authRequest.getContrasena());
        authManager.authenticate(auth);

        UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getEmail());
        String jwt = jwtService.generateToken(userDetails);

        return new AuthResponse(jwt);
    }
}
