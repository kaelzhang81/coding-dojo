package com.kaelzhang.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OrthogonalDesignTest {
    @Test
    public void find_all_red_product(){
        List<Product> repo = new ArrayList();
        repo.add(new Product());
        assertEquals(1, OrthogonalDesign.findAllRedProducts(repo).size());
    }

    @Test
    public void find_all_green_product() {
        List<Product> repo = new ArrayList();
        repo.add(new Product());
        assertEquals(1, OrthogonalDesign.findAllGreenProducts(repo).size());
    }
}
