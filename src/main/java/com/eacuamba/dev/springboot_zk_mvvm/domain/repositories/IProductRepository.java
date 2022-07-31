package com.eacuamba.dev.springboot_zk_mvvm.domain.repositories;

import com.eacuamba.dev.springboot_zk_mvvm.domain.models.Product;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IProductRepository  {
    Product save(Product product);

    Set<Product> findAll();
}
