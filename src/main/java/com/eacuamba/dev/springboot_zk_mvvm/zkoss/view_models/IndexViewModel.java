package com.eacuamba.dev.springboot_zk_mvvm.zkoss.view_models;

import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class IndexViewModel {

    @Getter
    @Setter
    private String page;

    @Command
    @NotifyChange("page")
    public void openProductForm(){
        System.out.println("Comando executado!");
        this.setPage("~./safe/product/product_form.zul");
    }
}
