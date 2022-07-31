package com.eacuamba.dev.springboot_zk_mvvm.domain.services;

import com.eacuamba.dev.springboot_zk_mvvm.domain.models.Product;
import com.eacuamba.dev.springboot_zk_mvvm.domain.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final IProductRepository productRepository;

    @Autowired
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product){
        return this.productRepository.save(product);
    }

}
