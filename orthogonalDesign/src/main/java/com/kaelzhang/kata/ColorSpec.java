package com.kaelzhang.kata;

import java.awt.Color;

public class ColorSpec implements ProductSpec {
    private Color color;

    public ColorSpec(Color color){
        this.color = color;
    }
    @Override
    public boolean satisfy(Product product) {
        if (product.getColor() == this.color){
            return true;
        }
        return false;
    }
}
