package com.kaelzhang.kata;

public class OrSpec extends CombinableSpec {
    public OrSpec(ProductSpec... specs){
        super(specs, true);
    }
}
