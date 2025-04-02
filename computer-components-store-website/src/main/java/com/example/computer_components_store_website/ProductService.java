package com.example.computer_components_store_website;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
