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

    public Product getProductById(Integer id) {
        return productRepository.findById(id).
                orElseThrow(() -> new IllegalStateException(
                        id + " not found"));
    }
    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }

    public void updateProduct(Integer id, Product product) {
        Product updatedProduct = productRepository.findById(id).
                orElseThrow(() -> new IllegalStateException(
                        id + " not found"
                ));
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        productRepository.save(product);
    }
}
