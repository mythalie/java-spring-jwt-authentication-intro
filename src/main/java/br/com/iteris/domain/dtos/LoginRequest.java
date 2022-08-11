package br.com.iteris.domain.dtos;

import javax.validation.constraints.NotEmpty;

public record LoginRequest (@NotEmpty String username, @NotEmpty String password){}
