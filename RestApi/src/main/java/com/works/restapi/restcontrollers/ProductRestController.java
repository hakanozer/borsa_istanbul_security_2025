package com.works.restapi.restcontrollers;

import com.works.restapi.entities.Product;
import com.works.restapi.entities.dtos.ProductAddDto;
import com.works.restapi.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductRestController {

    private final ProductService productService;

    @PostMapping("add")
    public Product addProduct(@Valid @RequestBody ProductAddDto productAddDto) {
        return productService.addProduct(productAddDto);
    }

    @GetMapping("list")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
