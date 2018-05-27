package com.kaelzhang.kata;

import java.awt.Color;

public class Product {
    private final Color color;
    private int weight;

    public Product(Color color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }
}
