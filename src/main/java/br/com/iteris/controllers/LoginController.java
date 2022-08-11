package br.com.iteris.controllers;

import br.com.iteris.domain.dtos.LoginRequest;
import br.com.iteris.domain.dtos.TokenResponse;
import br.com.iteris.services.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public TokenResponse login(@RequestBody @Valid LoginRequest loginRequest){
        return new TokenResponse(loginService.login(loginRequest));
    }
}
