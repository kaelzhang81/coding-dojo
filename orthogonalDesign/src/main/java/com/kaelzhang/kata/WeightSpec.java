package com.kaelzhang.kata;

public class WeightSpec implements ProductSpec {
    private final int weight;

    public WeightSpec(int weight){
        this.weight = weight;
    }

    @Override
    public boolean satisfy(Product product) {
        if (product.getWeight() < this.weight){
            return true;
        }
        return false;
    }
}
