package com.kaelzhang.kata;

import java.awt.*;
import java.util.ArrayList;

public class OrthogonalDesign {
    public static ArrayList findAllRedProducts(ArrayList repo){
        ArrayList result = new ArrayList();
        for(int i = 0; i < repo.size(); i++){
            Product product = (Product)repo.get(i);
            if (product.getColor() == Color.RED){
                result.add(product);
            }
        }
        return result;
    }
}
