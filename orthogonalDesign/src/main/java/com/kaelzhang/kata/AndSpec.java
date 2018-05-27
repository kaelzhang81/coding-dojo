package com.kaelzhang.kata;

public class AndSpec extends CombinableSpec {
    public AndSpec(ProductSpec... specs){
        super(specs, false);
    }
}
