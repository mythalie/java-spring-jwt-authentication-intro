package br.com.iteris.controllers;

import br.com.iteris.domain.dtos.WishlistItemRequest;
import br.com.iteris.services.WishlistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/wishlist")
@RolesAllowed("NORMAL_USER")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {

        this.wishlistService = wishlistService;
    }

    @GetMapping
    public List<String> getWishlist(){

        return this.wishlistService.getWishlistByUser(1l);
    }

    @PostMapping
    public void addWishlistItem(@RequestBody @Valid WishlistItemRequest wishlistItemRequest){
        this.wishlistService.save(wishlistItemRequest.description(), 1l);
    }
}
