package com.example.computer_components_store_website;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @GetMapping("")
    public List<Product> getProducts(){
        return List.of(
                new Product(
                        1,
                        "Lenovo Thinkpad",
                        489.99
                ),
                new Product(
                        2,
                        "Lenovo Thinkpad",
                        489.98
                )
        );
    }
}
