package br.com.iteris.controllers;

import br.com.iteris.domain.dtos.GetUsersResponse;
import br.com.iteris.domain.dtos.UserCreateRequest;
import br.com.iteris.domain.dtos.UserCreateResponse;
import br.com.iteris.domain.entities.User;
import br.com.iteris.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RolesAllowed("ADMIN_USER")
    @GetMapping
    public List<GetUsersResponse> getUsers(){
        return userService.getAllUsers();
    }

    @Secured("ROLE_ADMIN_USER")
    public ResponseEntity<UserCreateResponse> create(@Valid @RequestBody UserCreateRequest postModel) {
        UserCreateResponse retorno = userService.create(postModel);
        return ResponseEntity.ok(retorno);
    }
}
