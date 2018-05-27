package com.kaelzhang.kata;

import java.awt.*;

public class ColorAndBelowWeightSpec implements ProductSpec {
    private Color color1;
    private Color color2;
    private int limit;

    public ColorAndBelowWeightSpec(Color color1, Color color2, int limit){
        this.color1 = color1;
        this.color2 = color2;
        this.limit = limit;
    }

    @Override
    public boolean satisfy(Product product){
        return (product.getColor() == color1 || product.getColor() == color2)
                && product.getWeight() < limit;
    }
}
