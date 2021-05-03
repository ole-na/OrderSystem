package de.neuefische.rem_java21_2.group3.ordersystem.database;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;

import java.util.*;

public class ProductDB {
    private Map<String, Product> productMap = new HashMap<>();

    public ProductDB(Map<String, Product> givenProducts) {
        this.productMap.putAll(givenProducts);
    }

    public Map list(){
        return this.productMap;
    }

    public Optional<Product> get(String productId){
        Product product = this.productMap.get(productId);
        if(product == null) {
            throw new RuntimeException( "This product is not available.");
        }
        return Optional.of(product);
    }
}