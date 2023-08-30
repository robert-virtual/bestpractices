package com.example.bestpractices.service.product.dto;


import jakarta.validation.constraints.NotBlank;

public record ProductReq(
        @NotBlank(message = "name is mandatory")
        String name,
        String description,
        double price,
        int stock
) {
}
