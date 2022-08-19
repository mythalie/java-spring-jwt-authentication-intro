package br.com.iteris.domain.dtos;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserCreateRequest {
    @NotEmpty(message = "The name can't be empty")
    @Size(max = 50, message = "The first name has to contains between 1 and 50 characters")
    private String name;

    @NotEmpty(message = "The username can't be empty")
    @Size(max = 50, message = "The username has to contains between 1 and 50 characters")
    private String username;

    @NotEmpty(message = "The password can't be empty")
    @Size(max = 100, message = "The password has to contains between 1 and 100 characters")
    private String password;
}
