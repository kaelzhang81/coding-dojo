package com.kaelzhang.kata;

class CombinableSpec implements ProductSpec {
    private final ProductSpec[] specs;
    private final boolean shortcut;

    public CombinableSpec(ProductSpec[] specs, boolean shortcut){
        this.specs = specs;
        this.shortcut = shortcut;
    }

    @Override
    public boolean satisfy(Product product){
        for (ProductSpec spec: specs) {
            if (spec.satisfy(product) == this.shortcut){
                return this.shortcut;
            }
        }
        return  !this.shortcut;
    }
}
