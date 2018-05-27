package com.kaelzhang.kata;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static com.kaelzhang.kata.ProductSpec.*;
import static java.awt.Color.*;
import static org.junit.Assert.assertEquals;


public class ProductRepositoryTest {
    private ProductRepository repo;

    @Before
    public void initialize(){
        repo = new ProductRepository();
    }

    @Test
    public void find_all_red_products(){
        repo.add(new Product(RED, 20));
        assertEquals(1, repo.findProducts(color(RED)).size());
    }

    @Test
    public void find_all_green_products() {
        repo.add(new Product(GREEN, 5));
        assertEquals(1, repo.findProducts(color(GREEN)).size());
    }

    @Test
    public void find_all_weight_below_10_products() {
        ProductSpec spec = belowWeight(10);
        repo.add(new Product(RED, 5));

        assertEquals(1, repo.findProducts(spec).size());
    }

    @Test
    public void find_products_weight_bewlow_10_and_color_is_red_or_green(){
        repo.add(new Product(RED, 5));
        assertEquals(1, repo.findProducts(
                    and(
                            or(color(RED), color(GREEN)),
                            belowWeight(10)
                    )).size());
    }

    @Test
    public void find_products_weight_bewlow_10_and_color_is_red(){
        repo.add(new Product(RED, 5));
        assertEquals(1, repo.findProducts(
                and(
                        color(RED),
                        belowWeight(10)
                )).size());
    }

    @Test
    public void find_products_color_is_not_red(){
        repo.add(new Product(RED, 5));
        repo.add(new Product(Color.GREEN, 5));
        assertEquals(1, repo.findProducts(not(color(RED))).size());
    }
}
