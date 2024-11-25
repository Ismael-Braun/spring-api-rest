package com.api.spring_api_rest.controller;

import com.api.spring_api_rest.models.ProductModel;
import com.api.spring_api_rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    ProductRepository repository;

    @GetMapping("/product")
    public List<ProductModel> productList()
    {
        return repository.findAll();
    }

    @GetMapping("/product/{id}")
    public ProductModel uniqueProductById(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }

    @PostMapping("/product")
    public ProductModel createProduct(@RequestBody ProductModel product)
    {
        return repository.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable(value = "id")long id)
    {
        repository.deleteById(id);
    }

    @PutMapping("/product")
    public ProductModel updateProduct(@RequestBody ProductModel product)
    {
        return repository.save(product);
    }
}
