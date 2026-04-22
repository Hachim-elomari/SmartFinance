package com.smartfinance.smartfinance.controller;

import com.smartfinance.smartfinance.dto.LoginRequest;
import com.smartfinance.smartfinance.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService){
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        //versio simple (sasn validation DB pour l'instant)
        return jwtService.generateToken(request.username);
    }

}
