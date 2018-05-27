package com.kaelzhang.kata;

public class NotSpec implements ProductSpec {
    private  ProductSpec spec;

    public NotSpec(ProductSpec spec){
        this.spec = spec;
    }

    @Override
    public boolean satisfy(Product product) {
        return !spec.satisfy(product);
    }
}
