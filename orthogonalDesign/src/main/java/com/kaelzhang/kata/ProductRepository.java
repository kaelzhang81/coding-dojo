package com.kaelzhang.kata;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> repo = new ArrayList<>();

    public void add(Product product){
        this.repo.add(product);
    }

    public List<Product> findProducts(ProductSpec spec) {
        List<Product> result = new ArrayList<>();
        for (Product product : repo) {
            if (spec.satisfy(product)) {
                result.add(product);
            }
        }
        return result;
    }
}
