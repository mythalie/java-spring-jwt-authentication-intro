package br.com.iteris.controllers;

import br.com.iteris.domain.dtos.AuthenticatedUserDetails;
import br.com.iteris.domain.dtos.WishlistItemRequest;
import br.com.iteris.services.WishlistService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/wishlist")
@RolesAllowed({"NORMAL_USER", "ADMIN_USER"})
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {

        this.wishlistService = wishlistService;
    }

    @GetMapping
    public List<String> getWishlist(@AuthenticationPrincipal AuthenticatedUserDetails authenticatedUser){
        return this.wishlistService.getWishlistByUser(authenticatedUser.id());
    }

    @PostMapping
    public void addWishlistItem(@RequestBody @Valid WishlistItemRequest wishlistItemRequest, @AuthenticationPrincipal AuthenticatedUserDetails authenticatedUser){
        this.wishlistService.save(wishlistItemRequest.description(), authenticatedUser.id());
    }
}
