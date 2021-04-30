package de.neuefische.rem_java21_2.group3.ordersystem.services;

import de.neuefische.rem_java21_2.group3.ordersystem.database.OrderDb;
import de.neuefische.rem_java21_2.group3.ordersystem.database.ProductDB;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Order;
import de.neuefische.rem_java21_2.group3.ordersystem.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderService {

    private ProductDB productdb = new ProductDB(new HashMap<String, Product>());

    private OrderDb orderdb = new OrderDb(new ArrayList<>());

    public OrderService(ProductDB productdb) {
        this.productdb = productdb;
    }

    public OrderService(){}

    public void addOrder(String[] productIds) {
        if(productIds != null && productIds.length > 0){
            Product[] products = new Product[productIds.length];
            for(int i = 0; i < productIds.length; i++){
                Product product = productdb.get(productIds[i]);
                if(product == null){
                    return;
                } else {
                    products[i] = product;
                }
            }
            String orderId = String.valueOf(orderdb.list().size() + 1);
            Order xy = new Order(orderId, products);
            orderdb.add(xy);
        }

    }

    public List<Order> listOrders() {
        return orderdb.list();
    }
}
