package com.eacuamba.dev.springboot_zk_mvvm.domain.repositories.implementations;

import com.eacuamba.dev.springboot_zk_mvvm.domain.models.Product;
import com.eacuamba.dev.springboot_zk_mvvm.domain.repositories.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository implements IProductRepository {
    private static Set<Product> productCollection;

    static {
        productCollection = new HashSet<>();
    }
    @Override
    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        ProductRepository.productCollection.add(product);
        return product;
    }

    public Set<Product> findAll(){
        return ProductRepository.productCollection;
    }
}
