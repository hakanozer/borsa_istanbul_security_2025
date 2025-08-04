package com.works.restapi.services;

import com.works.restapi.entities.Product;
import com.works.restapi.entities.dtos.ProductAddDto;
import com.works.restapi.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public Product addProduct(ProductAddDto productAddDto) {
        Product product = new Product();
        product.setPrice(productAddDto.getPrice());
        product.setTitle(productAddDto.getTitle());
        productRepository.save(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
