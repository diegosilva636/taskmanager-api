package com.diego.taskmanager.controller;

import com.diego.taskmanager.dto.LoginRequestDTO;
import com.diego.taskmanager.dto.LoginResponseDTO;
import com.diego.taskmanager.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {

        String token = jwtService.generateToken(request.getEmail());

        return new LoginResponseDTO(token);
    }
}
