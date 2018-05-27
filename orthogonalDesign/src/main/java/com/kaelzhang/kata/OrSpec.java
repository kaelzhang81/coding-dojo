package com.kaelzhang.kata;

public class OrSpec implements ProductSpec {
    private ProductSpec[] specs;

    public OrSpec(ProductSpec... specs){
        this.specs = specs;
    }

    @Override
    public boolean satisfy(Product product){
        for (ProductSpec spec: specs ) {
            if (spec.satisfy(product)){
                return true;
            }
        }
        return false;
    }
}
