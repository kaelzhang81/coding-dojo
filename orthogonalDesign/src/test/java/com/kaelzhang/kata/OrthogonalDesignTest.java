package com.kaelzhang.kata;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OrthogonalDesignTest {
    @Test
    public void find_all_red_product(){
        ArrayList repo = new ArrayList();
        repo.add(new Product());
        assertEquals(1, OrthogonalDesign.findAllRedProducts(repo).size());
    }
}
