package com.kaelzhang.kata;

import java.awt.*;

public class ProductSpecs {

    public static ProductSpec color(Color color){
        return new ProductSpec() {
            @Override
            public boolean satisfy(Product product) {
                if (product.getColor() == color){
                    return true;
                }
                return false;
            }
        };
    }

    public static  ProductSpec belowWeight(int limit){
        return new ProductSpec() {
            @Override
            public boolean satisfy(Product product) {
                if (product.getWeight() < limit){
                    return true;
                }
                return false;
            }
        };
    }

    public static ProductSpec not(ProductSpec spec){
        return new ProductSpec() {
            @Override
            public boolean satisfy(Product product) {
                return !spec.satisfy(product);
            }
        };
    }

    private static ProductSpec combine(ProductSpec[] specs, boolean shortcut){
        return new ProductSpec() {

            @Override
            public boolean satisfy(Product product) {
                for (ProductSpec spec : specs)
                {
                    if (!spec.satisfy(product)) {
                        return shortcut;
                    }
                }
                return !shortcut;
            }
        };
    }

    public static ProductSpec and(ProductSpec... specs){
//        return new ProductSpec() {
//            @Override
//            public boolean satisfy(Product product) {
//                for (ProductSpec spec: specs) {
//                    if (!spec.satisfy(product)){
//                        return false;
//                    }
//                }
//                return true;
//            }
//        };
        return combine(specs, false);
    }

    public static ProductSpec or(ProductSpec... specs){
//        return new ProductSpec() {
//            @Override
//            public boolean satisfy(Product product) {
//                for (ProductSpec spec: specs) {
//                    if (spec.satisfy(product)){
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
        return combine(specs, true);
    }
}
