package com.kaelzhang.kata;

public class ProductDb {
    private Database db = new Database();
    private ProductRepository repo = new ProductRepository();

    public ProductDb(ProductRepository repo){
        this.repo = repo;
    }

    public void save(){
        this.repo.foreach(Database::save);
    }
}
