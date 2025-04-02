package com.example.computer_components_store_website;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }
    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable Integer id){
        productService.deleteProductById(id);
    }
    @PutMapping("{id}")
    public void updateProduct(@PathVariable Integer id, @RequestBody Product product){
        productService.updateProduct(id, product);
    }
}
