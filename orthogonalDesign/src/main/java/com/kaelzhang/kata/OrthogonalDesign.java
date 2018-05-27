package com.kaelzhang.kata;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class OrthogonalDesign {
    public static List<Product> findAllRedProducts(List<Product> repo){
        List<Product> result = new ArrayList<>();
        for (Product product: repo) {
            if (product.getColor() == Color.RED){
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> findAllGreenProducts(List<Product> repo) {
        List<Product> result = new ArrayList<>();
        for (Product product : repo) {
            if (product.getColor() == Color.GREEN) {
                result.add(product);
            }
        }
        return result;
    }
}
