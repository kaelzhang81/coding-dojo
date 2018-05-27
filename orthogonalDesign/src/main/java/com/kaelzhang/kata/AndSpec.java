package com.kaelzhang.kata;

public class AndSpec implements ProductSpec {
    private ProductSpec[] specs;

    public AndSpec(ProductSpec... specs){
        this.specs = specs;
    }

    @Override
    public boolean satisfy(Product product){
        for (ProductSpec spec : specs) {
            if(!spec.satisfy(product)){
                return false;
            }
        }
        return true;
    }
}
