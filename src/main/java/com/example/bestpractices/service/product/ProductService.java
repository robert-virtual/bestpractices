package com.example.bestpractices.service.product;

import com.example.bestpractices.model.Product;
import com.example.bestpractices.repository.ProductRepository;
import com.example.bestpractices.service.product.dto.ProductReq;
import com.example.bestpractices.service.product.dto.ProductRes;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelmapper;

    public ProductRes create(ProductReq productReq) {

        Product product = productRepository.save(
                modelmapper.map(productReq, Product.class)
        );
        return modelmapper.map(product, ProductRes.class);
    }
}
