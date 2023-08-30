package com.example.bestpractices.service.product.dto;

import lombok.Builder;

@Builder
public record ProductRes(long id, String name, String description, double price, int stock) {
}
