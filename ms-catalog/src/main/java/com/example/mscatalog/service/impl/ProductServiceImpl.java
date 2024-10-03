package com.example.mscatalog.service.impl;

import com.example.mscatalog.entity.Product;
import com.example.mscatalog.repository.ProductRepository;
import com.example.mscatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> list() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getById(Integer Id) {
        return productRepository.findById(Id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Integer Id, Product product) {
        product.setId(Id);
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer Id) {
        productRepository.deleteById(Id);
    }
}
