package com.kaelzhang.kata;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OrthogonalDesignTest {
    @Test
    public void find_all_red_products(){
        List<Product> repo = new ArrayList<>();
        repo.add(new Product(Color.RED, 20));
        assertEquals(1, OrthogonalDesign.findAllProducts(repo, Color.RED).size());
    }

    @Test
    public void find_all_green_products() {
        List<Product> repo = new ArrayList<>();
        repo.add(new Product(Color.GREEN, 5));
        assertEquals(1, OrthogonalDesign.findAllProducts(repo, Color.GREEN).size());
    }

    @Test
    public void find_all_weight_below_10_products() {
        List<Product> repo = new ArrayList<>();
        repo.add(new Product(Color.RED, 5));
        assertEquals(1, OrthogonalDesign.findProductsBelowWeight(repo, 10).size());
    }
}
