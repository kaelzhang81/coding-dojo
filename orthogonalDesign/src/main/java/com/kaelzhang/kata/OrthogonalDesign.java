package com.kaelzhang.kata;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class OrthogonalDesign {
    public static List<Product> findProducts(List<Product> repo, ProductSpec spec) {
        List<Product> result = new ArrayList<>();
        for (Product product : repo) {
            if (spec.satisfy(product)) {
                result.add(product);
            }
        }
        return result;
    }
}
