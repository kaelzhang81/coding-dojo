package com.kaelzhang.kata;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class OrthogonalDesign {
    public static List<Product> findAllProducts(List<Product> repo, Color color){
        List<Product> result = new ArrayList<>();
        for (Product product: repo) {
            if (product.getColor() == color){
                result.add(product);
            }
        }
        return result;
    }
}
