package br.com.iteris.services;

import br.com.iteris.domain.entities.Wishlist;
import br.com.iteris.repositories.WhislistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WishlistService {

    private final WhislistRepository whislistRepository;

    public WishlistService(WhislistRepository whislistRepository) {
        this.whislistRepository = whislistRepository;
    }

    public List<String> getWishlistByUser(Long userId){
        return whislistRepository.findByUser_id(userId).stream().
                map(Wishlist::getDescription).collect(Collectors.toList());
    }

    public void save(String description, Long userId){
        whislistRepository.save(new Wishlist(description, userId));
    }

}
