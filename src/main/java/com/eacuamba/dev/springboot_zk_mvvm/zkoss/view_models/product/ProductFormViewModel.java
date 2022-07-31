package com.eacuamba.dev.springboot_zk_mvvm.zkoss.view_models.product;

import com.eacuamba.dev.springboot_zk_mvvm.domain.models.Product;
import com.eacuamba.dev.springboot_zk_mvvm.domain.repositories.IProductRepository;
import com.eacuamba.dev.springboot_zk_mvvm.domain.repositories.implementations.ProductRepository;
import com.eacuamba.dev.springboot_zk_mvvm.domain.services.ProductService;
import com.eacuamba.dev.springboot_zk_mvvm.zkoss.view_models.GenericViewModel;
import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ProductFormViewModel extends GenericViewModel {

    @WireVariable
    ProductService productService;

    @WireVariable
    IProductRepository productRepository;

    @Getter
    @Setter
    private Product product;

    @Getter
    @Setter
    private Product selectedProduct;

    @Getter
    private Set<Product> products;

    @Init
    public void init(){
        this.product = new Product();
        this.getProduct().setCreatedAt(LocalDateTime.now());
        this.products = this.productRepository.findAll();
    }


    @Command
    @NotifyChange(".")
    public void saveProduct(@BindingParam(value = "product") Product product){
        this.productService.save(product);
        this.product = new Product();
    }
}
