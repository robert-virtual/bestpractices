package com.example.bestpractices.controller.product;

import com.example.bestpractices.service.product.ProductService;
import com.example.bestpractices.service.product.dto.ProductReq;
import com.example.bestpractices.service.product.dto.ProductRes;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("create")
    public ProductRes create(@Validated @RequestBody ProductReq productReq){
       return productService.create(productReq);
    }
}
