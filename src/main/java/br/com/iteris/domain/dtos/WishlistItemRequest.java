package br.com.iteris.domain.dtos;

import javax.validation.constraints.NotEmpty;

public record WishlistItemRequest(@NotEmpty String description) {
}
