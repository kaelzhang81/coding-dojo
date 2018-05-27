package com.kaelzhang.kata;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductRepositoryTest {
    private ProductRepository repo;

    @Before
    public void initialize(){
        repo = new ProductRepository();
    }

    @Test
    public void find_all_red_products(){
        ProductSpec spec = new ColorSpec(Color.RED);
        repo.add(new Product(Color.RED, 20));
        assertEquals(1, repo.findProducts(spec).size());
    }

    @Test
    public void find_all_green_products() {
        ProductSpec spec = new ColorSpec(Color.GREEN);
        repo.add(new Product(Color.GREEN, 5));
        assertEquals(1, repo.findProducts(spec).size());
    }

    @Test
    public void find_all_weight_below_10_products() {
        ProductSpec spec = new WeightSpec(10);
        repo.add(new Product(Color.RED, 5));

        assertEquals(1, repo.findProducts(spec).size());
    }

    @Test
    public void find_products_weight_bewlow_10_and_color_is_green(){
        ProductSpec spec = new WeightSpec(10);
        repo.add(new Product(Color.RED, 5));
        assertEquals(1, repo.findProducts(spec).size());
    }
}
